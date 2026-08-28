import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dho extends dez {
   public static final MapCodec<dho> a = b(dho::new);
   public static final dsw b = div.aE;
   public static final dst c = dss.h;
   protected static final ewk d = dez.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewk e = dez.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewk f = ewh.a(d, e);
   private static dsh g;

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dho(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   public static dsh b() {
      if (g == null) {
         g = dsi.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsg.a(dsl.a))
            .a('^', dsg.a(dsl.a(dfb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dsg.a(dsl.a(dfb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dsg.a(dsl.a(dfb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dsg.a(dsl.a(dfb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
