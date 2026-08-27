import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cvp extends ctc {
   public static final MapCodec<cvp> a = b(cvp::new);
   public static final dfx b = cww.aE;
   public static final dfu c = dft.h;
   protected static final eia d = ctc.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eia e = ctc.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eia f = ehx.a(d, e);
   private static dfi g;

   @Override
   public MapCodec<cvp> a() {
      return a;
   }

   public cvp(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   public static dfi b() {
      if (g == null) {
         g = dfj.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dfh.a(dfm.a))
            .a('^', dfh.a(dfm.a(cte.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ha.d))))
            .a('>', dfh.a(dfm.a(cte.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ha.e))))
            .a('v', dfh.a(dfm.a(cte.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ha.c))))
            .a('<', dfh.a(dfm.a(cte.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ha.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
