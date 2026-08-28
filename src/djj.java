import com.mojang.serialization.MapCodec;

public class djj extends dfh implements dhz, dip {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dti<jh> b = dta.T;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jh.k));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsk a(cxm $$0) {
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
   public dpp a(ja $$0, dsk $$1) {
      return new dqq($$0, $$1);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      dpp $$5 = $$1.c_($$2);
      if ($$5 instanceof dqq && $$3.gw()) {
         $$3.a((dqq)$$5);
         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   public static boolean a(emw.c $$0, emw.c $$1) {
      jf $$2 = m($$0.b());
      jf $$3 = m($$1.b());
      jf $$4 = n($$0.b());
      jf $$5 = n($$1.b());
      dqq.a $$6 = dqq.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqq.a.b : dqq.a.a);
      boolean $$7 = $$6 == dqq.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jf m(dsk $$0) {
      return $$0.c(b).a();
   }

   public static jf n(dsk $$0) {
      return $$0.c(b).b();
   }
}
