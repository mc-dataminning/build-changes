import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dil extends dfw {
   public static final MapCodec<dil> a = b(dil::new);
   public static final dtu b = djs.aE;
   public static final dtr c = dtq.h;
   protected static final exp d = dfw.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final exp e = dfw.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final exp f = exm.a(d, e);
   private static dtf g;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   public static dtf b() {
      if (g == null) {
         g = dtg.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dte.a(dtj.a))
            .a('^', dte.a(dtj.a(dfy.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.d))))
            .a('>', dte.a(dtj.a(dfy.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.e))))
            .a('v', dte.a(dtj.a(dfy.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.c))))
            .a('<', dte.a(dtj.a(dfy.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
