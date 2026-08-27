import com.mojang.serialization.MapCodec;

public class czg extends cvf implements cxx, cyn {
   public static final MapCodec<czg> a = b(czg::new);
   public static final dil<id> b = did.T;

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   protected czg(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, id.k));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.k();
      ib $$2;
      if ($$1.o() == ib.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ib.b;
      }

      return this.o().a(b, id.a($$1, $$2));
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgi($$0, $$1);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      dfi $$6 = $$1.c_($$2);
      if ($$6 instanceof dgi && $$3.gq()) {
         $$3.a((dgi)$$6);
         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   public static boolean a(ebm.c $$0, ebm.c $$1) {
      ib $$2 = h($$0.b());
      ib $$3 = h($$1.b());
      ib $$4 = n($$0.b());
      ib $$5 = n($$1.b());
      dgi.a $$6 = dgi.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dgi.a.b : dgi.a.a);
      boolean $$7 = $$6 == dgi.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ib h(dhn $$0) {
      return $$0.c(b).a();
   }

   public static ib n(dhn $$0) {
      return $$0.c(b).b();
   }
}
