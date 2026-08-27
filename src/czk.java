import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czk extends cvf implements dcf {
   public static final MapCodec<czk> a = b(czk::new);
   public static final dih b = cza.aE;
   public static final die c = did.C;
   protected static final float d = 3.0F;
   protected static final eks e = cvf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eks f = cvf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks g = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eks h = cvf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   protected czk(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(crl $$0, hx $$1, ib $$2) {
      dhn $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      if (!$$0.c()) {
         dhn $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dhn $$2 = this.o();
      csi $$3 = $$0.q();
      hx $$4 = $$0.a();
      ecx $$5 = $$0.q().b_($$0.a());

      for (ib $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ecy.c));
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }
}
