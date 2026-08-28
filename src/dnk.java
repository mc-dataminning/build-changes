import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dnk extends dku {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final dzk<jo> b = dot.e;
   public static final dzd c = dzc.k;
   private static final fdo d = dku.b(16.0, 0.0, 13.0);
   private static final fdo e = fdl.a(d, dku.b(8.0, 13.0, 16.0));
   private static dyr f;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   public static dyr b() {
      if (f == null) {
         f = dys.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dyq.a(dyv.a))
            .a('^', dyq.a(dyv.a(dkw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jo.d))))
            .a('>', dyq.a(dyv.a(dkw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jo.e))))
            .a('v', dyq.a(dyv.a(dkw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jo.c))))
            .a('<', dyq.a(dyv.a(dkw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jo.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
