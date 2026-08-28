import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgw extends dek {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final dtb b = dsr.aT;
   public static final dss c = dsr.p;
   protected static final ewj d = dey.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public dgw(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(dsb $$0, dbx $$1, iz $$2) {
      int $$3 = $$1.a(dcg.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayy.b($$4));
      }

      $$3 = ayy.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqt.a;
         } else {
            dsb $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dwu.c, $$2, dwu.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqt.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpi.q, dgw::a) : null;
   }

   private static void a(dbx $$0, iz $$1, dsb $$2, dpv $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }
}
