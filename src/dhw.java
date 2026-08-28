import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhw extends dfh {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final dte b = djd.aE;
   public static final dtb c = dta.h;
   protected static final ewy d = dfh.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewy e = dfh.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewy f = ewv.a(d, e);
   private static dsp g;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   public static dsp b() {
      if (g == null) {
         g = dsq.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dso.a(dst.a))
            .a('^', dso.a(dst.a(dfj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.d))))
            .a('>', dso.a(dst.a(dfj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.e))))
            .a('v', dso.a(dst.a(dfj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.c))))
            .a('<', dso.a(dst.a(dfj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
