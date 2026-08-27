import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cum extends cvf implements dcf {
   public static final MapCodec<cum> a = b(cum::new);
   public static final die b = did.C;

   @Override
   public MapCodec<cum> a() {
      return a;
   }

   protected cum(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return true;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.a;
   }

   @Override
   public float d(dhn $$0, crl $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(b) ? ecy.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ecy.c));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public clo a(@Nullable cdz $$0, csg $$1, hx $$2, dhn $$3) {
      return $$0 != null && $$0.f() ? dcf.super.a($$0, $$1, $$2, $$3) : clo.b;
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return $$0 != null && $$0.f() ? dcf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
