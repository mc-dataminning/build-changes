import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cze extends cwp {
   public static final MapCodec<cze> a = b(cze::new);
   public static final dka b = dak.aE;
   public static final djx c = djw.h;
   protected static final eml d = cwp.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eml e = cwp.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eml f = emi.a(d, e);
   private static djl g;

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   public cze(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   public static djl b() {
      if (g == null) {
         g = djm.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', djk.a(djp.a))
            .a('^', djk.a(djp.a(cwr.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.d))))
            .a('>', djk.a(djp.a(cwr.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.e))))
            .a('v', djk.a(djp.a(cwr.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.c))))
            .a('<', djk.a(djp.a(cwr.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
