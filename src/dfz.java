import com.mojang.serialization.MapCodec;

public class dfz extends dby implements deq, dfg {
   public static final MapCodec<dfz> a = b(dfz::new);
   public static final dpx<ij> b = dpp.T;

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   protected dfz(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.k));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.k();
      ih $$2;
      if ($$1.o() == ih.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ih.b;
      }

      return this.n().a(b, ij.a($$1, $$2));
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnf($$0, $$1);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      dmf $$5 = $$1.c_($$2);
      if ($$5 instanceof dnf && $$3.gw()) {
         $$3.a((dnf)$$5);
         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   public static boolean a(ejh.c $$0, ejh.c $$1) {
      ih $$2 = m($$0.b());
      ih $$3 = m($$1.b());
      ih $$4 = n($$0.b());
      ih $$5 = n($$1.b());
      dnf.a $$6 = dnf.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dnf.a.b : dnf.a.a);
      boolean $$7 = $$6 == dnf.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ih m(doz $$0) {
      return $$0.c(b).a();
   }

   public static ih n(doz $$0) {
      return $$0.c(b).b();
   }
}
