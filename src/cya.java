import com.mojang.serialization.MapCodec;

public class cya extends cua implements cwq, cxg {
   public static final MapCodec<cya> a = b(cya::new);
   public static final dgz<hz> b = dgr.T;

   @Override
   public MapCodec<cya> a() {
      return a;
   }

   protected cya(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hz.k));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dgb a(cmr $$0) {
      hx $$1 = $$0.k();
      hx $$2;
      if ($$1.o() == hx.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = hx.b;
      }

      return this.o().a(b, hz.a($$1, $$2));
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dew($$0, $$1);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ddx $$6 = $$1.c_($$2);
      if ($$6 instanceof dew && $$3.gp()) {
         $$3.a((dew)$$6);
         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   public static boolean a(dzt.c $$0, dzt.c $$1) {
      hx $$2 = h($$0.b());
      hx $$3 = h($$1.b());
      hx $$4 = n($$0.b());
      hx $$5 = n($$1.b());
      dew.a $$6 = dew.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dew.a.b : dew.a.a);
      boolean $$7 = $$6 == dew.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hx h(dgb $$0) {
      return $$0.c(b).a();
   }

   public static hx n(dgb $$0) {
      return $$0.c(b).b();
   }
}
