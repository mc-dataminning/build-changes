import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dgp extends dea {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final drx b = dhw.aE;
   public static final dru c = drt.h;
   protected static final evf d = dea.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final evf e = dea.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final evf f = evc.a(d, e);
   private static dri g;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   public static dri b() {
      if (g == null) {
         g = drj.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', drh.a(drm.a))
            .a('^', drh.a(drm.a(dec.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.d))))
            .a('>', drh.a(drm.a(dec.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.e))))
            .a('v', drh.a(drm.a(dec.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.c))))
            .a('<', drh.a(drm.a(dec.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
