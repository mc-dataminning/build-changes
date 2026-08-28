import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgv extends dej {
   public static final MapCodec<dgv> a = b(dgv::new);
   public static final dta b = dsq.aT;
   public static final dsr c = dsq.p;
   protected static final ewi d = dex.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(dsa $$0, dbw $$1, iz $$2) {
      int $$3 = $$1.a(dcf.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayx.b($$4));
      }

      $$3 = ayx.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqs.a;
         } else {
            dsa $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dwt.c, $$2, dwt.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqs.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dph.q, dgv::a) : null;
   }

   private static void a(dbw $$0, iz $$1, dsa $$2, dpu $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }
}
