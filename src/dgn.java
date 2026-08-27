import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dgn extends ddy {
   public static final MapCodec<dgn> a = b(dgn::new);
   public static final drv b = dhu.aE;
   public static final drs c = drr.h;
   protected static final evd d = ddy.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final evd e = ddy.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final evd f = eva.a(d, e);
   private static drg g;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   public static drg b() {
      if (g == null) {
         g = drh.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', drf.a(drk.a))
            .a('^', drf.a(drk.a(dea.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.d))))
            .a('>', drf.a(drk.a(dea.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.e))))
            .a('v', drf.a(drk.a(dea.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.c))))
            .a('<', drf.a(drk.a(dea.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(it.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
