import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhu extends dfi {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dua b = dtq.aT;
   public static final dtr c = dtq.p;
   protected static final exp d = dfw.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b);
   }

   private static void d(dta $$0, dcu $$1, jd $$2) {
      int $$3 = $$1.a(ddd.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayn.b($$4));
      }

      $$3 = ayn.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bqq.a;
         } else {
            dta $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxw.c, $$2, dxw.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqq.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dqh.q, dhu::a) : null;
   }

   private static void a(dcu $$0, jd $$1, dta $$2, dqu $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }
}
