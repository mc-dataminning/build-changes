import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dkr implements dim {
   public static final MapCodec<dnx> c = b(dnx::new);
   public static final dwn d = dwe.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fal h = dij.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fal i = dij.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fal j = dij.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fal k = dij.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fal[] l = new fal[]{dij.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fal[] m = new fal[]{j, dij.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dnx> a() {
      return c;
   }

   public dnx(dvn.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      return this.m();
   }

   @Override
   public fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$0.c(b) == dwj.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dwj.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dil.a.m();
      }
   }

   @Override
   public boolean a(dvo $$0, dfi $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.cC);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3 instanceof cma && $$1.ac().b(dfb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dvo $$0, czw $$1) {
      return false;
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
   }

   @Override
   public boolean f(dvo $$0) {
      return $$0.c(b) == dwj.b && !this.q($$0);
   }

   @Override
   public void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      float $$4 = dke.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arq $$0, dvo $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dvo $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dwj.a), 3);
         }
      }
   }

   private static boolean a(dfi $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dil.kB);
   }

   private static boolean b(dfi $$0, jh $$1) {
      return dke.a($$0, $$1);
   }

   private static boolean o(dvo $$0) {
      return $$0.a(dil.kB) && $$0.c(b) == dwj.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dfi $$0, jh $$1, dvo $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dvo $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dnx.a d(dfi $$0, jh $$1, dvo $$2) {
      if (o($$2)) {
         return new dnx.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dvo $$4 = $$0.a_($$3);
         return o($$4) ? new dnx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      dnx.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      dnx.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dvo b) {
   }
}
