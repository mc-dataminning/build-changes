import com.mojang.serialization.MapCodec;

public class ddg extends czf implements dbx, dcn {
   public static final MapCodec<ddg> a = b(ddg::new);
   public static final dnc<ij> b = dmu.T;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   protected ddg(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.k));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.k();
      ih $$2;
      if ($$1.o() == ih.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ih.b;
      }

      return this.o().a(b, ij.a($$1, $$2));
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkl($$0, $$1);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      djl $$5 = $$1.c_($$2);
      if ($$5 instanceof dkl && $$3.gs()) {
         $$3.a((dkl)$$5);
         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   public static boolean a(egg.c $$0, egg.c $$1) {
      ih $$2 = m($$0.b());
      ih $$3 = m($$1.b());
      ih $$4 = n($$0.b());
      ih $$5 = n($$1.b());
      dkl.a $$6 = dkl.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dkl.a.b : dkl.a.a);
      boolean $$7 = $$6 == dkl.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ih m(dme $$0) {
      return $$0.c(b).a();
   }

   public static ih n(dme $$0) {
      return $$0.c(b).b();
   }
}
