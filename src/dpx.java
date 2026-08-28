import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpx extends dmn implements dkh {
   public static final MapCodec<dpx> c = b(dpx::new);
   public static final int d = 4;
   public static final dyq e = dyg.aw;
   public static final dyo<dym> f = dmn.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fcr i = dke.b(6.0, -1.0, 3.0);
   private static final fcr C = dke.b(10.0, -1.0, 5.0);
   private final Function<dxq, fcr> Q = this.b();

   @Override
   public MapCodec<dpx> a() {
      return c;
   }

   public dpx(dxp.d $$0) {
      super($$0);
   }

   private Function<dxq, fcr> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((dym)$$1.c(f)) {
            case b -> dke.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dke.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return this.m();
   }

   @Override
   public fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      if ($$0.c(f) == dym.b) {
         return $$0.c(e) == 0 ? i : C;
      } else {
         return fco.a();
      }
   }

   @Override
   public dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dkg.a.m();
      }
   }

   @Override
   public boolean a(dxq $$0, dhc $$1, ji $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cmx && $$4.O().b(dgv.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dxq $$0, dax $$1) {
      return false;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
   }

   @Override
   public boolean f(dxq $$0) {
      return $$0.c(f) == dym.b && !this.q($$0);
   }

   @Override
   public void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      float $$4 = dma.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ard $$0, dxq $$1, ji $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dxq $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, dym.a), 3);
         }
      }
   }

   private static boolean a(dhc $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dkg.ld);
   }

   private static boolean b(dhc $$0, ji $$1) {
      return dma.a($$0, $$1);
   }

   private static boolean o(dxq $$0) {
      return $$0.a(dkg.ld) && $$0.c(f) == dym.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhc $$0, ji $$1, dxq $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dxq $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dpx.a c(dhc $$0, ji $$1, dxq $$2) {
      if (o($$2)) {
         return new dpx.a($$1, $$2);
      } else {
         ji $$3 = $$1.e();
         dxq $$4 = $$0.a_($$3);
         return o($$4) ? new dpx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      dpx.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      dpx.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ji a, dxq b) {
   }
}
