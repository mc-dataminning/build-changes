import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dnc extends dkl {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final dyr<jm> b = doj.aF;
   public static final dyl c = dyk.h;
   protected static final fcr d = dkl.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fcr e = dkl.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fcr f = fco.a(d, e);
   private static dxz g;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   public static dxz b() {
      if (g == null) {
         g = dya.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxy.a(dyd.a))
            .a('^', dxy.a(dyd.a(dkn.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dxy.a(dyd.a(dkn.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dxy.a(dyd.a(dkn.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dxy.a(dyd.a(dkn.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
