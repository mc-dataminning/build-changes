import com.mojang.serialization.MapCodec;

public class dic extends dea implements dgs, dhi {
   public static final MapCodec<dic> a = b(dic::new);
   public static final dsb<iv> b = drt.T;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iv.k));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.k();
      it $$2;
      if ($$1.o() == it.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = it.b;
      }

      return this.n().a(b, iv.a($$1, $$2));
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpi($$0, $$1);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      doi $$5 = $$1.c_($$2);
      if ($$5 instanceof dpi && $$3.gz()) {
         $$3.a((dpi)$$5);
         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   public static boolean a(ell.c $$0, ell.c $$1) {
      it $$2 = m($$0.b());
      it $$3 = m($$1.b());
      it $$4 = n($$0.b());
      it $$5 = n($$1.b());
      dpi.a $$6 = dpi.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dpi.a.b : dpi.a.a);
      boolean $$7 = $$6 == dpi.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static it m(drd $$0) {
      return $$0.c(b).a();
   }

   public static it n(drd $$0) {
      return $$0.c(b).b();
   }
}
