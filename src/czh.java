import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czh extends cur {
   public static final MapCodec<czh> a = b(czh::new);
   public static final die b = did.n;

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   protected czh(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sd $$5 = cjh.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dgj $$6) {
         $$6.k();
         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dgj $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgj($$0, $$1);
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if ($$1.c_($$2) instanceof dgj $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dgj $$3 && $$3.x().d() instanceof cmg $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$1.c(b) ? a($$2, dfk.e, dgj::a) : null;
   }
}
