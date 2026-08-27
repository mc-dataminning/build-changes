import java.util.List;
import java.util.Optional;

public class cpz extends crn {
   private static final int a = axm.f(0.4F, 0.4F, 1.0F);

   public cpz(crn.a $$0) {
      super($$0);
   }

   public static float d(crs $$0) {
      cua $$1 = $$0.a(jr.w, cua.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(crs $$0, cos $$1, cne $$2, cka $$3) {
      if ($$2 != cne.b) {
         return false;
      } else {
         cua $$4 = $$0.a(jr.w);
         if ($$4 == null) {
            return false;
         } else {
            crs $$5 = $$1.g();
            cua.a $$6 = new cua.a($$4);
            if ($$5.d()) {
               this.a($$3);
               crs $$7 = $$6.a();
               if ($$7 != null) {
                  crs $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.f().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(jr.w, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(crs $$0, crs $$1, cos $$2, cne $$3, cka $$4, brk $$5) {
      if ($$3 == cne.b && $$2.b($$4)) {
         cua $$6 = $$0.a(jr.w);
         if ($$6 == null) {
            return false;
         } else {
            cua.a $$7 = new cua.a($$6);
            if ($$1.d()) {
               crs $$8 = $$7.a();
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

            $$0.b(jr.w, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(auz.c.b(this));
         return bog.a($$3, $$0.x_());
      } else {
         return bog.d($$3);
      }
   }

   @Override
   public boolean e(crs $$0) {
      cua $$1 = $$0.a(jr.w, cua.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(crs $$0) {
      cua $$1 = $$0.a(jr.w, cua.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(crs $$0) {
      return a;
   }

   private static boolean a(crs $$0, cka $$1) {
      cua $$2 = $$0.a(jr.w);
      if ($$2 != null && !$$2.d()) {
         $$0.b(jr.w, cua.b);
         if ($$1 instanceof apv) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cpc> h(crs $$0) {
      return Optional.ofNullable($$0.a(jr.w)).map(cpb::new);
   }

   @Override
   public void a(crs $$0, czg $$1, List<wi> $$2, cti $$3) {
      cua $$4 = $$0.a(jr.w);
      if ($$4 != null) {
         $$2.add(wi.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(cgk $$0) {
      cua $$1 = $$0.p().a(jr.w);
      if ($$1 != null) {
         $$0.p().b(jr.w, cua.b);
         cru.a($$0, $$1.a());
      }
   }

   private void a(bqa $$0) {
      $$0.a(auo.dq, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void b(bqa $$0) {
      $$0.a(auo.dp, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void c(bqa $$0) {
      $$0.a(auo.do, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }
}
