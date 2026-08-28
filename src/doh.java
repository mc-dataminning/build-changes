import com.mojang.serialization.MapCodec;

public class doh extends dkd implements dmw, dnm {
   public static final MapCodec<doh> a = b(doh::new);
   public static final dyl<jo> b = dye.W;

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   protected doh(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dxo a(dax $$0) {
      jm $$1 = $$0.k();
      jm $$2;
      if ($$1.o() == jm.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jm.b;
      }

      return this.m().b(b, jo.a($$1, $$2));
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvt($$0, $$1);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      duq $$5 = $$1.c_($$2);
      if ($$5 instanceof dvt && $$3.gG()) {
         $$3.a((dvt)$$5);
         return bta.a;
      } else {
         return bta.e;
      }
   }

   public static boolean a(esf.a $$0, esf.a $$1) {
      jm $$2 = o($$0.a().b());
      jm $$3 = o($$1.a().b());
      jm $$4 = p($$0.a().b());
      jm $$5 = p($$1.a().b());
      dvt.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvt.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jm o(dxo $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dxo $$0) {
      return $$0.c(b).b();
   }
}
