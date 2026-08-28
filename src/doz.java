import com.mojang.serialization.MapCodec;

public class doz extends dku implements dnn, doe {
   public static final MapCodec<doz> a = b(doz::new);
   public static final dzk<jq> b = dzc.W;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   protected doz(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jq.k));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dym a(dbn $$0) {
      jo $$1 = $$0.k();
      jo $$2;
      if ($$1.o() == jo.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jo.b;
      }

      return this.m().b(b, jq.a($$1, $$2));
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwp($$0, $$1);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      dvl $$5 = $$1.c_($$2);
      if ($$5 instanceof dwp && $$3.gF()) {
         $$3.a((dwp)$$5);
         return btq.a;
      } else {
         return btq.e;
      }
   }

   public static boolean a(eti.a $$0, eti.a $$1) {
      jo $$2 = o($$0.a().b());
      jo $$3 = o($$1.a().b());
      jo $$4 = p($$0.a().b());
      jo $$5 = p($$1.a().b());
      dwp.a $$6 = $$0.b();
      boolean $$7 = $$6 == dwp.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jo o(dym $$0) {
      return $$0.c(b).a();
   }

   public static jo p(dym $$0) {
      return $$0.c(b).b();
   }
}
