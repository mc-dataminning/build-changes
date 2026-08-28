import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ery extends ert {
   public static final float e = 0.44444445F;

   @Override
   public eru d() {
      return erw.d;
   }

   @Override
   public eru e() {
      return erw.e;
   }

   @Override
   public cwi a() {
      return cwq.qB;
   }

   @Override
   public void a(dfm $$0, jh $$1, erv $$2, azu $$3) {
      jh $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ls.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awn.nQ, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.nO, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arp $$0, jh $$1, erv $$2, azu $$3) {
      if ($$0.N().b(dfi.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jh $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dvv $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dfp)$$0, $$5)) {
                     $$0.b($$5, did.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jh $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), did.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dfp $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dfp $$0, jh $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lq h() {
      return ls.i;
   }

   @Override
   protected void a(dfn $$0, jh $$1, dvv $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dfp $$0) {
      return $$0.F_().i() ? 4 : 2;
   }

   @Override
   public dvv b(erv $$0) {
      return dis.H.m().b(dnf.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eru $$0) {
      return $$0 == erw.e || $$0 == erw.d;
   }

   @Override
   public int c(dfp $$0) {
      return $$0.F_().i() ? 1 : 2;
   }

   @Override
   public boolean a(erv $$0, der $$1, jh $$2, eru $$3, jm $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axi.a);
   }

   @Override
   public int a(dfp $$0) {
      return $$0.F_().i() ? 10 : 30;
   }

   @Override
   public int a(dfm $$0, jh $$1, erv $$2, erv $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.G_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dfn $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arp $$0) {
      return $$0.N().b(dfi.V);
   }

   @Override
   protected void a(dfn $$0, jh $$1, dvv $$2, jm $$3, erv $$4) {
      if ($$3 == jm.a) {
         erv $$5 = $$0.b_($$1);
         if (this.a(axi.b) && $$5.a(axi.a)) {
            if ($$2.b() instanceof dnf) {
               $$0.a($$1, dis.b.m(), 3);
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
   public Optional<awm> j() {
      return Optional.of(awn.dl);
   }

   public static class a extends ery {
      @Override
      protected void a(dvw.a<eru, erv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(erv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(erv $$0) {
         return false;
      }
   }

   public static class b extends ery {
      @Override
      public int d(erv $$0) {
         return 8;
      }

      @Override
      public boolean c(erv $$0) {
         return true;
      }
   }
}
