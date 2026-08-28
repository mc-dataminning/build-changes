import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkh extends dhv {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final dwn b = dwe.aT;
   public static final dwf c = dwe.p;
   protected static final fal d = dij.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   private static void e(dvo $$0, dff $$1, jh $$2) {
      int $$3 = $$1.a(dfo.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azn.b($$4));
      }

      $$3 = azn.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$3.gy()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dvo $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eak.c, $$2, eak.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsh.a;
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return !$$0.C && $$0.D_().g() ? a($$2, dst.q, dkh::a) : null;
   }

   private static void a(dff $$0, jh $$1, dvo $$2, dtg $$3) {
      if ($$0.aa() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }
}
