import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eny extends ent {
   public static final float e = 0.44444445F;

   @Override
   public enu d() {
      return enw.d;
   }

   @Override
   public enu e() {
      return enw.e;
   }

   @Override
   public cuk a() {
      return cus.qA;
   }

   @Override
   public void a(dby $$0, iz $$1, env $$2, azh $$3) {
      iz $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(li.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awa.nR, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.nP, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dby $$0, iz $$1, env $$2, azh $$3) {
      if ($$0.ab().b(dbu.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            iz $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dsc $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dcb)$$0, $$5)) {
                     $$0.b($$5, dem.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               iz $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dem.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dcb $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dcb $$0, iz $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lg h() {
      return li.i;
   }

   @Override
   protected void a(dbz $$0, iz $$1, dsc $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dcb $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dsc b(env $$0) {
      return dfb.H.o().a(djp.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(enu $$0) {
      return $$0 == enw.e || $$0 == enw.d;
   }

   @Override
   public int c(dcb $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(env $$0, dbe $$1, iz $$2, enu $$3, je $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awv.a);
   }

   @Override
   public int a(dcb $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dby $$0, iz $$1, env $$2, env $$3) {
      int $$4 = this.a((dcb)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dbe)$$0, $$1) > $$2.a((dbe)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dbz $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dby $$0) {
      return $$0.ab().b(dbu.V);
   }

   @Override
   protected void a(dbz $$0, iz $$1, dsc $$2, je $$3, env $$4) {
      if ($$3 == je.a) {
         env $$5 = $$0.b_($$1);
         if (this.a(awv.b) && $$5.a(awv.a)) {
            if ($$2.b() instanceof djp) {
               $$0.a($$1, dfb.b.o(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.dl);
   }

   public static class a extends eny {
      @Override
      protected void a(dsd.a<enu, env> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(env $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(env $$0) {
         return false;
      }
   }

   public static class b extends eny {
      @Override
      public int d(env $$0) {
         return 8;
      }

      @Override
      public boolean c(env $$0) {
         return true;
      }
   }
}
