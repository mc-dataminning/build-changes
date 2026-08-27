import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddw extends dbk {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final dpz b = dpp.aT;
   public static final dpq c = dpp.p;
   protected static final est d = dby.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   private static void d(doz $$0, cyx $$1, ib $$2) {
      int $$3 = $$1.a(czg.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * axk.b($$4));
      }

      $$3 = axk.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return boa.a;
         } else {
            doz $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dts.c, $$2, dts.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return boa.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dmh.q, ddw::a) : null;
   }

   private static void a(cyx $$0, ib $$1, doz $$2, dmu $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }
}
