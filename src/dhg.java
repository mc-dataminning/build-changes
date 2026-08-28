import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends deu {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dtl b = dtb.aT;
   public static final dtc c = dtb.p;
   protected static final exa d = dfi.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(b);
   }

   private static void d(dsl $$0, dcg $$1, ja $$2) {
      int $$3 = $$1.a(dcp.a, $$2) - $$1.B_();
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
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$3.gm()) {
         if ($$1.B) {
            return bqh.a;
         } else {
            dsl $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dxh.c, $$2, dxh.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqh.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dps.q, dhg::a) : null;
   }

   private static void a(dcg $$0, ja $$1, dsl $$2, dqf $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }
}
