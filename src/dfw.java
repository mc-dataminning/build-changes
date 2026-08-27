import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfw extends ddk {
   public static final MapCodec<dfw> a = b(dfw::new);
   public static final dsb b = drr.aT;
   public static final drs c = drr.p;
   protected static final evd d = ddy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b);
   }

   private static void d(drb $$0, dax $$1, io $$2) {
      int $$3 = $$1.a(dbg.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayd.b($$4));
      }

      $$3 = ayd.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bpu.a;
         } else {
            drb $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dvu.c, $$2, dvu.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bpu.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dov($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, doi.q, dfw::a) : null;
   }

   private static void a(dax $$0, io $$1, drb $$2, dov $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }
}
