import java.util.List;
import java.util.Optional;

public class crg extends csu {
   private static final int a = axz.f(0.4F, 0.4F, 1.0F);

   public crg(csu.a $$0) {
      super($$0);
   }

   public static float d(csz $$0) {
      cvk $$1 = $$0.a(ka.D, cvk.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(csz $$0, cpz $$1, col $$2, clh $$3) {
      if ($$2 != col.b) {
         return false;
      } else {
         cvk $$4 = $$0.a(ka.D);
         if ($$4 == null) {
            return false;
         } else {
            csz $$5 = $$1.g();
            cvk.a $$6 = new cvk.a($$4);
            if ($$5.d()) {
               this.a($$3);
               csz $$7 = $$6.a();
               if ($$7 != null) {
                  csz $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.f().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(ka.D, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(csz $$0, csz $$1, cpz $$2, col $$3, clh $$4, bsr $$5) {
      if ($$3 == col.b && $$2.b($$4)) {
         cvk $$6 = $$0.a(ka.D);
         if ($$6 == null) {
            return false;
         } else {
            cvk.a $$7 = new cvk.a($$6);
            if ($$1.d()) {
               csz $$8 = $$7.a();
               if ($$8 != null) {
                  this.a($$4);
                  $$5.a($$8);
               }
            } else {
               int $$9 = $$7.a($$1);
               if ($$9 > 0) {
                  this.b($$4);
               }
            }

            $$0.b(ka.D, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avm.c.b(this));
         return bpn.a($$3, $$0.x_());
      } else {
         return bpn.d($$3);
      }
   }

   @Override
   public boolean e(csz $$0) {
      cvk $$1 = $$0.a(ka.D, cvk.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(csz $$0) {
      cvk $$1 = $$0.a(ka.D, cvk.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(csz $$0) {
      return a;
   }

   private static boolean a(csz $$0, clh $$1) {
      cvk $$2 = $$0.a(ka.D);
      if ($$2 != null && !$$2.d()) {
         $$0.b(ka.D, cvk.b);
         if ($$1 instanceof aqi) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cqj> h(csz $$0) {
      return Optional.ofNullable($$0.a(ka.D)).map(cqi::new);
   }

   @Override
   public void a(csz $$0, dad $$1, List<wu> $$2, cuq $$3) {
      cvk $$4 = $$0.a(ka.D);
      if ($$4 != null) {
         $$2.add(wu.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(chr $$0) {
      cvk $$1 = $$0.p().a(ka.D);
      if ($$1 != null) {
         $$0.p().b(ka.D, cvk.b);
         ctb.a($$0, $$1.a());
      }
   }

   private void a(brh $$0) {
      $$0.a(avc.dq, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void b(brh $$0) {
      $$0.a(avc.dp, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void c(brh $$0) {
      $$0.a(avc.do, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }
}
