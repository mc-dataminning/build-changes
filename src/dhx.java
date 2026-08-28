import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhx extends dfi {
   public static final MapCodec<dhx> a = b(dhx::new);
   public static final dtf b = dje.aE;
   public static final dtc c = dtb.h;
   protected static final exa d = dfi.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final exa e = dfi.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final exa f = ewx.a(d, e);
   private static dsq g;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   public static dsq b() {
      if (g == null) {
         g = dsr.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsp.a(dsu.a))
            .a('^', dsp.a(dsu.a(dfk.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.d))))
            .a('>', dsp.a(dsu.a(dfk.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.e))))
            .a('v', dsp.a(dsu.a(dfk.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.c))))
            .a('<', dsp.a(dsu.a(dfk.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
