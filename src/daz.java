import com.mojang.serialization.MapCodec;

public class daz extends cwy implements czq, dag {
   public static final MapCodec<daz> a = b(daz::new);
   public static final dkn<ie> b = dkf.T;

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   protected daz(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.k));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.k();
      ic $$2;
      if ($$1.o() == ic.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ic.b;
      }

      return this.o().a(b, ie.a($$1, $$2));
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new did($$0, $$1);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      dhd $$5 = $$1.c_($$2);
      if ($$5 instanceof did && $$3.gp()) {
         $$3.a((did)$$5);
         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   public static boolean a(edo.c $$0, edo.c $$1) {
      ic $$2 = h($$0.b());
      ic $$3 = h($$1.b());
      ic $$4 = n($$0.b());
      ic $$5 = n($$1.b());
      did.a $$6 = did.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? did.a.b : did.a.a);
      boolean $$7 = $$6 == did.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ic h(djp $$0) {
      return $$0.c(b).a();
   }

   public static ic n(djp $$0) {
      return $$0.c(b).b();
   }
}
