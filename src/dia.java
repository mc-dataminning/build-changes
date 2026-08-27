import com.mojang.serialization.MapCodec;

public class dia extends ddy implements dgq, dhg {
   public static final MapCodec<dia> a = b(dia::new);
   public static final drz<iv> b = drr.T;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iv.k));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public drb a(cwz $$0) {
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
   public dog a(io $$0, drb $$1) {
      return new dpg($$0, $$1);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      dog $$5 = $$1.c_($$2);
      if ($$5 instanceof dpg && $$3.gz()) {
         $$3.a((dpg)$$5);
         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   public static boolean a(elj.c $$0, elj.c $$1) {
      it $$2 = m($$0.b());
      it $$3 = m($$1.b());
      it $$4 = n($$0.b());
      it $$5 = n($$1.b());
      dpg.a $$6 = dpg.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dpg.a.b : dpg.a.a);
      boolean $$7 = $$6 == dpg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static it m(drb $$0) {
      return $$0.c(b).a();
   }

   public static it n(drb $$0) {
      return $$0.c(b).b();
   }
}
