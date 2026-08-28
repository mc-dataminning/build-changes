import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends det {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dtk b = dta.aT;
   public static final dtb c = dta.p;
   protected static final ewy d = dfh.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b);
   }

   private static void d(dsk $$0, dcf $$1, ja $$2) {
      int $$3 = $$1.a(dco.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayg.b($$4));
      }

      $$3 = ayg.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bqg.a;
         } else {
            dsk $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxg.c, $$2, dxg.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqg.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpr.q, dhf::a) : null;
   }

   private static void a(dcf $$0, ja $$1, dsk $$2, dqe $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }
}
