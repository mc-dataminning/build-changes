import java.util.Optional;
import javax.annotation.Nullable;

public abstract class emd extends ely {
   public static final float e = 0.44444445F;

   @Override
   public elz d() {
      return emb.d;
   }

   @Override
   public elz e() {
      return emb.e;
   }

   @Override
   public csu a() {
      return ctc.qA;
   }

   @Override
   public void a(dad $$0, in $$1, ema $$2, ayg $$3) {
      in $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kx.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avc.nH, avd.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avc.nF, avd.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dad $$0, in $$1, ema $$2, ayg $$3) {
      if ($$0.aa().b(czz.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            in $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dqh $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dag)$$0, $$5)) {
                     $$0.b($$5, dcr.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               in $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dcr.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dag $$0, in $$1) {
      for (is $$2 : is.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dag $$0, in $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public kv h() {
      return kx.i;
   }

   @Override
   protected void a(dae $$0, in $$1, dqh $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dag $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dqh b(ema $$0) {
      return ddg.H.n().a(dhu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(elz $$0) {
      return $$0 == emb.e || $$0 == emb.d;
   }

   @Override
   public int c(dag $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ema $$0, czj $$1, in $$2, elz $$3, is $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(avw.a);
   }

   @Override
   public int a(dag $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dad $$0, in $$1, ema $$2, ema $$3) {
      int $$4 = this.a((dag)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((czj)$$0, $$1) > $$2.a((czj)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dae $$0, in $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dad $$0) {
      return $$0.aa().b(czz.V);
   }

   @Override
   protected void a(dae $$0, in $$1, dqh $$2, is $$3, ema $$4) {
      if ($$3 == is.a) {
         ema $$5 = $$0.b_($$1);
         if (this.a(avw.b) && $$5.a(avw.a)) {
            if ($$2.b() instanceof dhu) {
               $$0.a($$1, ddg.b.n(), 3);
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
   public Optional<avb> j() {
      return Optional.of(avc.dl);
   }

   public static class a extends emd {
      @Override
      protected void a(dqi.a<elz, ema> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ema $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ema $$0) {
         return false;
      }
   }

   public static class b extends emd {
      @Override
      public int d(ema $$0) {
         return 8;
      }

      @Override
      public boolean c(ema $$0) {
         return true;
      }
   }
}
