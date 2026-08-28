import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cch extends bza<cqy> {
   private long c;

   public cch() {
      super(ImmutableMap.of(cgl.s, cgm.a, cgl.h, cgm.a), 350, 350);
   }

   protected boolean a(arq $$0, cqy $$1) {
      return this.a($$1);
   }

   protected boolean a(arq $$0, cqy $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arq $$0, cqy $$1, long $$2) {
      bvy $$3 = $$1.eb().c(cgl.s).get();
      bzc.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dX().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arq $$0, cqy $$1, long $$2) {
      cqy $$3 = (cqy)$$1.eb().c(cgl.s).get();
      if (!($$1.g($$3) > 5.0)) {
         bzc.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gJ();
            $$3.gJ();
            this.a($$0, $$1, $$3);
         } else if ($$1.dX().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arq $$0, cqy $$1, cqy $$2) {
      Optional<iv> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cqy> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agm.c($$0, $$3.get());
         }
      }
   }

   protected void d(arq $$0, cqy $$1, long $$2) {
      $$1.eb().b(cgl.s);
   }

   private boolean a(cqy $$0) {
      byj<cqy> $$1 = $$0.eb();
      Optional<bvy> $$2 = $$1.c(cgl.s).filter($$0x -> $$0x.an() == bwr.bD);
      return $$2.isEmpty() ? false : bzc.a($$1, cgl.s, bwr.bD) && $$0.T_() && $$2.get().T_();
   }

   private Optional<iv> b(arq $$0, cqy $$1) {
      return $$0.A().a($$0x -> $$0x.a(cip.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.du(), 48);
   }

   private boolean a(cqy $$0, iv $$1, jf<cio> $$2) {
      exo $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cqy> b(arq $$0, cqy $$1, cqy $$2) {
      cqy $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dz(), $$1.dB(), $$1.dF(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arq $$0, cqy $$1, iv $$2) {
      je $$3 = je.a($$0.aj(), $$2);
      $$1.eb().a(cgl.b, $$3);
   }
}
