import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daq extends cye {
   public static final MapCodec<daq> a = b(daq::new);
   public static final dmj b = dlz.aT;
   public static final dma c = dlz.p;
   protected static final eos d = cys.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daq(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(b);
   }

   private static void d(dlj $$0, cvr $$1, hz $$2) {
      int $$3 = $$1.a(cwa.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * awi.b($$4));
      }

      $$3 = awi.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$3.gf()) {
         if ($$1.B) {
            return blw.a;
         } else {
            dlj $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dpw.c, $$2, dpw.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return blw.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, diz.q, daq::a) : null;
   }

   private static void a(cvr $$0, hz $$1, dlj $$2, djm $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }
}
