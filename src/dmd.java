import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmd extends djn {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxp c = dxo.l;
   protected static final fbv d = djn.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fbv e = djn.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fbv f = fbs.a(d, e);
   private static dxd g;

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   public static dxd b() {
      if (g == null) {
         g = dxe.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxc.a(dxh.a))
            .a('^', dxc.a(dxh.a(djp.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.d))))
            .a('>', dxc.a(dxh.a(djp.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.e))))
            .a('v', dxc.a(dxh.a(djp.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.c))))
            .a('<', dxc.a(dxh.a(djp.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
