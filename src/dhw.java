import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dfk {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final duc b = dts.aT;
   public static final dtt c = dts.p;
   protected static final ext d = dfy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(b);
   }

   private static void d(dtc $$0, dcw $$1, jd $$2) {
      int $$3 = $$1.a(ddf.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayo.b($$4));
      }

      $$3 = ayo.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bqr.a;
         } else {
            dtc $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxz.c, $$2, dxz.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqr.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dqj.q, dhw::a) : null;
   }

   private static void a(dcw $$0, jd $$1, dtc $$2, dqw $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }
}
