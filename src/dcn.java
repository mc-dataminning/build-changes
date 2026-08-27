import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcn extends cvf {
   public static final MapCodec<dcn> a = b(dcn::new);
   public static final int b = 8;
   public static final din c = did.aF;
   protected static final eks[] d = new eks[]{
      ekp.a(),
      cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   protected dcn(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public float d(dhn $$0, crl $$1, hx $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.d());
      if ($$3.a(ark.cg)) {
         return false;
      } else {
         return $$3.a(ark.ch) ? true : cvf.a($$3.k($$1, $$2.d()), ib.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.a(cso.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ib.b : true;
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }
}
