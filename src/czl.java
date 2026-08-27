import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czl extends cvf implements dcf {
   public static final MapCodec<czl> a = b(czl::new);
   public static final die b = did.j;
   public static final die c = did.C;
   protected static final eks d = ekp.a(cvf.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cvf.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eks e = ekp.a(cvf.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cvf.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   public czl(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());

      for (ib $$2 : $$0.f()) {
         if ($$2.o() == ib.a.b) {
            dhn $$3 = this.o().a(b, Boolean.valueOf($$2 == ib.b));
            if ($$3.a((csi)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ecy.c));
            }
         }
      }

      return null;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = h($$0).g();
      return cvf.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ib h(dhn $$0) {
      return $$0.c(b) ? ib.a : ib.b;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
