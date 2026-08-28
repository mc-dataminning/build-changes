import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cca extends byt<cqk> {
   private long c;

   public cca() {
      super(ImmutableMap.of(cge.s, cgf.a, cge.h, cgf.a), 350, 350);
   }

   protected boolean a(arq $$0, cqk $$1) {
      return this.a($$1);
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      bvt $$3 = $$1.eb().c(cge.s).get();
      byv.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      cqk $$3 = (cqk)$$1.eb().c(cge.s).get();
      if (!($$1.g($$3) > 5.0)) {
         byv.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gG();
            $$3.gG();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arq $$0, cqk $$1, cqk $$2) {
      Optional<iu> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cqk> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agm.c($$0, $$3.get());
         }
      }
   }

   protected void d(arq $$0, cqk $$1, long $$2) {
      $$1.eb().b(cge.s);
   }

   private boolean a(cqk $$0) {
      byc<cqk> $$1 = $$0.eb();
      Optional<bvt> $$2 = $$1.c(cge.s).filter($$0x -> $$0x.aq() == bwm.bD);
      return $$2.isEmpty() ? false : byv.a($$1, cge.s, bwm.bD) && $$0.S_() && $$2.get().S_();
   }

   private Optional<iu> b(arq $$0, cqk $$1) {
      return $$0.A().a($$0x -> $$0x.a(cii.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cqk $$0, iu $$1, je<cih> $$2) {
      ewu $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cqk> b(arq $$0, cqk $$1, cqk $$2) {
      cqk $$3 = $$1.b($$0, $$2);
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

   private void a(arq $$0, cqk $$1, iu $$2) {
      jd $$3 = jd.a($$0.aj(), $$2);
      $$1.eb().a(cge.b, $$3);
   }
}
