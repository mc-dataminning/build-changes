import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbb extends bxu<cpe> {
   private long c;

   public cbb() {
      super(ImmutableMap.of(cff.r, cfg.a, cff.h, cfg.a), 350, 350);
   }

   protected boolean a(ash $$0, cpe $$1) {
      return this.a($$1);
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      buw $$3 = $$1.eb().c(cff.r).get();
      bxw.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      cpe $$3 = (cpe)$$1.eb().c(cff.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxw.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gC();
            $$3.gC();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ash $$0, cpe $$1, cpe $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cpe> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.z().b($$3.get());
            ahj.c($$0, $$3.get());
         }
      }
   }

   protected void d(ash $$0, cpe $$1, long $$2) {
      $$1.eb().b(cff.r);
   }

   private boolean a(cpe $$0) {
      bxd<cpe> $$1 = $$0.eb();
      Optional<buw> $$2 = $$1.c(cff.r).filter($$0x -> $$0x.aq() == bvm.bD);
      return $$2.isEmpty() ? false : bxw.a($$1, cff.r, bvm.bD) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<jh> b(ash $$0, cpe $$1) {
      return $$0.z().a($$0x -> $$0x.a(chj.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cpe $$0, jh $$1, jq<chi> $$2) {
      eud $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cpe> b(ash $$0, cpe $$1, cpe $$2) {
      cpe $$3 = $$1.b($$0, $$2);
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

   private void a(ash $$0, cpe $$1, jh $$2) {
      jp $$3 = jp.a($$0.ah(), $$2);
      $$1.eb().a(cff.b, $$3);
   }
}
