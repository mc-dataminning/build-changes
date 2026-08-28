import com.mojang.serialization.MapCodec;

public class dlz extends dhy implements dkq, dlf {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dwb<jn> b = dvt.T;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.k));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dvd a(czm $$0) {
      jl $$1 = $$0.k();
      jl $$2;
      if ($$1.o() == jl.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jl.b;
      }

      return this.m().b(b, jn.a($$1, $$2));
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dti($$0, $$1);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      dsg $$5 = $$1.c_($$2);
      if ($$5 instanceof dti && $$3.gH()) {
         $$3.a((dti)$$5);
         return bry.a;
      } else {
         return bry.e;
      }
   }

   public static boolean a(ept.c $$0, ept.c $$1) {
      jl $$2 = o($$0.b());
      jl $$3 = o($$1.b());
      jl $$4 = p($$0.b());
      jl $$5 = p($$1.b());
      dti.a $$6 = dti.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dti.a.b : dti.a.a);
      boolean $$7 = $$6 == dti.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jl o(dvd $$0) {
      return $$0.c(b).a();
   }

   public static jl p(dvd $$0) {
      return $$0.c(b).b();
   }
}
