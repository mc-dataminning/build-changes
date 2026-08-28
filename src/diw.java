import com.mojang.serialization.MapCodec;

public class diw extends deu implements dhm, dic {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dsv<jg> b = dsn.T;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   protected diw(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public drx a(cxv $$0) {
      je $$1 = $$0.k();
      je $$2;
      if ($$1.o() == je.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = je.b;
      }

      return this.n().a(b, jg.a($$1, $$2));
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqc($$0, $$1);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      dpc $$5 = $$1.c_($$2);
      if ($$5 instanceof dqc && $$3.gz()) {
         $$3.a((dqc)$$5);
         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   public static boolean a(emf.c $$0, emf.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqc.a $$6 = dqc.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqc.a.b : dqc.a.a);
      boolean $$7 = $$6 == dqc.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(drx $$0) {
      return $$0.c(b).a();
   }

   public static je n(drx $$0) {
      return $$0.c(b).b();
   }
}
