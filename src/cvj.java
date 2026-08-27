import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvj extends cur {
   public static final MapCodec<cvj> a = b(cvj::new);
   public static final die[] b = new die[]{did.k, did.l, did.m};
   protected static final eks c = ekp.a(cvf.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cvf.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cvj> a() {
      return a;
   }

   public cvj(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? null : a($$2, dfk.l, dfl::a);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dfl) {
            $$3.a((dfl)$$6);
            $$3.a(arf.aa);
         }

         return bjb.b;
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dfl) {
            ((dfl)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
