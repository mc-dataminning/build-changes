import java.util.List;
import java.util.Optional;

public class csl extends cuc {
   private static final int a = aym.f(0.4F, 0.4F, 1.0F);

   public csl(cuc.a $$0) {
      super($$0);
   }

   public static float d(cuh $$0) {
      cxd $$1 = $$0.a(ke.D, cxd.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(cuh $$0, cre $$1, cpo $$2, cly $$3) {
      if ($$2 != cpo.b) {
         return false;
      } else {
         cxd $$4 = $$0.a(ke.D);
         if ($$4 == null) {
            return false;
         } else {
            cuh $$5 = $$1.g();
            cxd.a $$6 = new cxd.a($$4);
            if ($$5.d()) {
               this.a($$3);
               cuh $$7 = $$6.a();
               if ($$7 != null) {
                  cuh $$8 = $$1.b_($$7);
                  $$6.a($$8);
               }
            } else if ($$5.f().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(ke.D, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(cuh $$0, cuh $$1, cre $$2, cpo $$3, cly $$4, btf $$5) {
      if ($$3 == cpo.b && $$2.b($$4)) {
         cxd $$6 = $$0.a(ke.D);
         if ($$6 == null) {
            return false;
         } else {
            cxd.a $$7 = new cxd.a($$6);
            if ($$1.d()) {
               cuh $$8 = $$7.a();
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

            $$0.b(ke.D, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avz.c.b(this));
         return bqb.a($$3, $$0.x_());
      } else {
         return bqb.d($$3);
      }
   }

   @Override
   public boolean e(cuh $$0) {
      cxd $$1 = $$0.a(ke.D, cxd.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(cuh $$0) {
      cxd $$1 = $$0.a(ke.D, cxd.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(cuh $$0) {
      return a;
   }

   private static boolean a(cuh $$0, cly $$1) {
      cxd $$2 = $$0.a(ke.D);
      if ($$2 != null && !$$2.d()) {
         $$0.b(ke.D, cxd.b);
         if ($$1 instanceof aqu) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cro> h(cuh $$0) {
      return Optional.ofNullable($$0.a(ke.D)).map(crn::new);
   }

   @Override
   public void a(cuh $$0, dca $$1, List<xe> $$2, cwi $$3) {
      cxd $$4 = $$0.a(ke.D);
      if ($$4 != null) {
         $$2.add(xe.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(cig $$0) {
      cxd $$1 = $$0.p().a(ke.D);
      if ($$1 != null) {
         $$0.p().b(ke.D, cxd.b);
         cuj.a($$0, $$1.a());
      }
   }

   private void a(brv $$0) {
      $$0.a(avo.dv, 0.8F, 0.8F + $$0.dU().F_().i() * 0.4F);
   }

   private void b(brv $$0) {
      $$0.a(avo.du, 0.8F, 0.8F + $$0.dU().F_().i() * 0.4F);
   }

   private void c(brv $$0) {
      $$0.a(avo.dt, 0.8F, 0.8F + $$0.dU().F_().i() * 0.4F);
   }
}
