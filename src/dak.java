import com.mojang.serialization.MapCodec;

public class dak extends cwj implements czb, czr {
   public static final MapCodec<dak> a = b(dak::new);
   public static final djy<ie> b = djq.T;

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   protected dak(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.k));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dja a(cpa $$0) {
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
   public dgo a(hx $$0, dja $$1) {
      return new dho($$0, $$1);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      dgo $$6 = $$1.c_($$2);
      if ($$6 instanceof dho && $$3.gp()) {
         $$3.a((dho)$$6);
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   public static boolean a(ecz.c $$0, ecz.c $$1) {
      ic $$2 = h($$0.b());
      ic $$3 = h($$1.b());
      ic $$4 = n($$0.b());
      ic $$5 = n($$1.b());
      dho.a $$6 = dho.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dho.a.b : dho.a.a);
      boolean $$7 = $$6 == dho.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ic h(dja $$0) {
      return $$0.c(b).a();
   }

   public static ic n(dja $$0) {
      return $$0.c(b).b();
   }
}
