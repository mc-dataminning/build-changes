import com.mojang.serialization.MapCodec;

public class dnr extends djn implements dmg, dmw {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final dxv<jp> b = dxo.W;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   protected dnr(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jp.k));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dwy a(dah $$0) {
      jn $$1 = $$0.k();
      jn $$2;
      if ($$1.o() == jn.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jn.b;
      }

      return this.m().b(b, jp.a($$1, $$2));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvd($$0, $$1);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      dua $$5 = $$1.c_($$2);
      if ($$5 instanceof dvd && $$3.gG()) {
         $$3.a((dvd)$$5);
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   public static boolean a(erp.a $$0, erp.a $$1) {
      jn $$2 = o($$0.a().b());
      jn $$3 = o($$1.a().b());
      jn $$4 = p($$0.a().b());
      jn $$5 = p($$1.a().b());
      dvd.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvd.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jn o(dwy $$0) {
      return $$0.c(b).a();
   }

   public static jn p(dwy $$0) {
      return $$0.c(b).b();
   }
}
