import com.mojang.serialization.MapCodec;

public class daa extends cvz implements cyr, czh {
   public static final MapCodec<daa> a = b(daa::new);
   public static final djn<ic> b = djf.T;

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   protected daa(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.k));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.k();
      ia $$2;
      if ($$1.o() == ia.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ia.b;
      }

      return this.o().a(b, ic.a($$1, $$2));
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhd($$0, $$1);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      dgd $$6 = $$1.c_($$2);
      if ($$6 instanceof dhd && $$3.gp()) {
         $$3.a((dhd)$$6);
         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   public static boolean a(eco.c $$0, eco.c $$1) {
      ia $$2 = h($$0.b());
      ia $$3 = h($$1.b());
      ia $$4 = n($$0.b());
      ia $$5 = n($$1.b());
      dhd.a $$6 = dhd.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dhd.a.b : dhd.a.a);
      boolean $$7 = $$6 == dhd.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ia h(dip $$0) {
      return $$0.c(b).a();
   }

   public static ia n(dip $$0) {
      return $$0.c(b).b();
   }
}
