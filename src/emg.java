import java.util.Optional;
import javax.annotation.Nullable;

public abstract class emg extends ely {
   @Override
   public elz d() {
      return emb.b;
   }

   @Override
   public elz e() {
      return emb.c;
   }

   @Override
   public csu a() {
      return ctc.qz;
   }

   @Override
   public void a(dad $$0, in $$1, ema $$2, ayg $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avc.BN, avd.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kx.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public kv h() {
      return kx.l;
   }

   @Override
   protected boolean a(dad $$0) {
      return $$0.aa().b(czz.U);
   }

   @Override
   protected void a(dae $$0, in $$1, dqh $$2) {
      dnm $$3 = $$2.t() ? $$0.c_($$1) : null;
      dde.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dag $$0) {
      return 4;
   }

   @Override
   public dqh b(ema $$0) {
      return ddg.G.n().a(dhu.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(elz $$0) {
      return $$0 == emb.c || $$0 == emb.b;
   }

   @Override
   public int c(dag $$0) {
      return 1;
   }

   @Override
   public int a(dag $$0) {
      return 5;
   }

   @Override
   public boolean a(ema $$0, czj $$1, in $$2, elz $$3, is $$4) {
      return $$4 == is.a && !$$3.a(avw.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avb> j() {
      return Optional.of(avc.di);
   }

   public static class a extends emg {
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

   public static class b extends emg {
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
