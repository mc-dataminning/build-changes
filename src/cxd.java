import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxd extends cur {
   public static final MapCodec<cxd> a = b(cxd::new);
   public static final din b = did.aT;
   public static final die c = did.p;
   protected static final eks d = cvf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   public cxd(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b);
   }

   private static void d(dhn $$0, csf $$1, hx $$2) {
      int $$3 = $$1.a(cso.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * atq.b($$4));
      }

      $$3 = atq.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$3.gf()) {
         if ($$1.B) {
            return bjb.a;
         } else {
            dhn $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dlx.c, $$2, dlx.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bjb.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dfk.q, cxd::a) : null;
   }

   private static void a(csf $$0, hx $$1, dhn $$2, dfx $$3) {
      if ($$0.W() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }
}
