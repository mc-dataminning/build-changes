import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cxr extends cur {
   public static final MapCodec<cxr> a = b(cxr::new);
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hx> c = hx.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hx::i).toList();

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   protected cxr(dhm.d $$0) {
      super($$0);
   }

   public static boolean a(csf $$0, hx $$1, hx $$2) {
      return $$0.a_($$1.a((ja)$$2)).a(ark.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(ark.co);
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (hx $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               jw.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? a($$2, dfk.m, dgc::a) : null;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bjb.b;
      }
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      dfi $$3 = $$1.c_($$2);
      if ($$3 instanceof dgc) {
         uv $$4 = ((bjf)$$3).Q_();
         return new bjk(($$2x, $$3x, $$4x) -> new chl($$2x, $$3x, chc.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dgc) {
            ((dgc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
