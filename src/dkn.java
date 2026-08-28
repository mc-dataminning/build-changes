import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dkn extends dhy {
   public static final MapCodec<dkn> a = b(dkn::new);
   public static final dvx b = dlt.aF;
   public static final dvu c = dvt.h;
   protected static final fab d = dhy.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fab e = dhy.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fab f = ezy.a(d, e);
   private static dvi g;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   public static dvi b() {
      if (g == null) {
         g = dvj.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dvh.a(dvm.a))
            .a('^', dvh.a(dvm.a(dia.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jl.d))))
            .a('>', dvh.a(dvm.a(dia.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jl.e))))
            .a('v', dvh.a(dvm.a(dia.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jl.c))))
            .a('<', dvh.a(dvm.a(dia.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jl.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
