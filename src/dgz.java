import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgz extends den {
   public static final MapCodec<dgz> a = b(dgz::new);
   public static final dte b = dsu.aT;
   public static final dsv c = dsu.p;
   protected static final ewm d = dfb.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return d;
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(dse $$0, dca $$1, iz $$2) {
      int $$3 = $$1.a(dcj.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayz.b($$4));
      }

      $$3 = ayz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqw.a;
         } else {
            dse $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dwx.c, $$2, dwx.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqw.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpl.q, dgz::a) : null;
   }

   private static void a(dca $$0, iz $$1, dse $$2, dpy $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }
}
