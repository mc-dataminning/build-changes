import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccc extends byv<cqo> {
   private long c;

   public ccc() {
      super(ImmutableMap.of(cgg.s, cgh.a, cgg.h, cgh.a), 350, 350);
   }

   protected boolean a(arq $$0, cqo $$1) {
      return this.a($$1);
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      bvv $$3 = $$1.ec().c(cgg.s).get();
      byx.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      cqo $$3 = (cqo)$$1.ec().c(cgg.s).get();
      if (!($$1.g($$3) > 5.0)) {
         byx.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gH();
            $$3.gH();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arq $$0, cqo $$1, cqo $$2) {
      Optional<iu> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cqo> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agm.c($$0, $$3.get());
         }
      }
   }

   protected void d(arq $$0, cqo $$1, long $$2) {
      $$1.ec().b(cgg.s);
   }

   private boolean a(cqo $$0) {
      bye<cqo> $$1 = $$0.ec();
      Optional<bvv> $$2 = $$1.c(cgg.s).filter($$0x -> $$0x.aq() == bwo.bD);
      return $$2.isEmpty() ? false : byx.a($$1, cgg.s, bwo.bD) && $$0.T_() && $$2.get().T_();
   }

   private Optional<iu> b(arq $$0, cqo $$1) {
      return $$0.A().a($$0x -> $$0x.a(cik.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cqo $$0, iu $$1, je<cij> $$2) {
      exc $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cqo> b(arq $$0, cqo $$1, cqo $$2) {
      cqo $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dA(), $$1.dC(), $$1.dG(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arq $$0, cqo $$1, iu $$2) {
      jd $$3 = jd.a($$0.aj(), $$2);
      $$1.ec().a(cgg.b, $$3);
   }
}
