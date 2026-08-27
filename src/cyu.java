import com.mojang.serialization.MapCodec;

public class cyu extends cut implements cxk, cya {
   public static final MapCodec<cyu> a = b(cyu::new);
   public static final dhu<hz> b = dhm.T;

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   protected cyu(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hz.k));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dgw a(cnj $$0) {
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
   public der a(ht $$0, dgw $$1) {
      return new dfr($$0, $$1);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      der $$6 = $$1.c_($$2);
      if ($$6 instanceof dfr && $$3.gp()) {
         $$3.a((dfr)$$6);
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   public static boolean a(eav.c $$0, eav.c $$1) {
      hx $$2 = h($$0.b());
      hx $$3 = h($$1.b());
      hx $$4 = n($$0.b());
      hx $$5 = n($$1.b());
      dfr.a $$6 = dfr.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dfr.a.b : dfr.a.a);
      boolean $$7 = $$6 == dfr.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hx h(dgw $$0) {
      return $$0.c(b).a();
   }

   public static hx n(dgw $$0) {
      return $$0.c(b).b();
   }
}
