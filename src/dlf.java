import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dlf extends diq {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dws<jm> b = dml.aF;
   public static final dwm c = dwl.h;
   protected static final fas d = diq.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fas e = diq.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fas f = fap.a(d, e);
   private static dwa g;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   public static dwa b() {
      if (g == null) {
         g = dwb.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dvz.a(dwe.a))
            .a('^', dvz.a(dwe.a(dis.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dvz.a(dwe.a(dis.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dvz.a(dwe.a(dis.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dvz.a(dwe.a(dis.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
