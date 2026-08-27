import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dbu extends czf {
   public static final MapCodec<dbu> a = b(dbu::new);
   public static final dmy b = dda.aE;
   public static final dmv c = dmu.h;
   protected static final epo d = czf.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final epo e = czf.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final epo f = epl.a(d, e);
   private static dmj g;

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   public dbu(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   public static dmj b() {
      if (g == null) {
         g = dmk.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dmi.a(dmn.a))
            .a('^', dmi.a(dmn.a(czh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.d))))
            .a('>', dmi.a(dmn.a(czh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.e))))
            .a('v', dmi.a(dmn.a(czh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.c))))
            .a('<', dmi.a(dmn.a(czh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
