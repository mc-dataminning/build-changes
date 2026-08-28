import com.mojang.serialization.MapCodec;

public class djk extends dfi implements dia, diq {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dtj<jh> b = dtb.T;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jh.k));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsl a(cxn $$0) {
      jf $$1 = $$0.k();
      jf $$2;
      if ($$1.o() == jf.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jf.b;
      }

      return this.o().a(b, jh.a($$1, $$2));
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqr($$0, $$1);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      dpq $$5 = $$1.c_($$2);
      if ($$5 instanceof dqr && $$3.gx()) {
         $$3.a((dqr)$$5);
         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   public static boolean a(emy.c $$0, emy.c $$1) {
      jf $$2 = m($$0.b());
      jf $$3 = m($$1.b());
      jf $$4 = n($$0.b());
      jf $$5 = n($$1.b());
      dqr.a $$6 = dqr.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqr.a.b : dqr.a.a);
      boolean $$7 = $$6 == dqr.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jf m(dsl $$0) {
      return $$0.c(b).a();
   }

   public static jf n(dsl $$0) {
      return $$0.c(b).b();
   }
}
