import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwf extends dbq implements dcf {
   public static final MapCodec<cwf> a = b(cwf::new);
   public static final die b = did.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eks e = cvf.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eks f = cvf.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eks g = cvf.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   public cwf(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ib.a.b));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ecy.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(b) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
