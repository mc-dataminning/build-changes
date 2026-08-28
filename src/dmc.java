import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmc extends djm {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxo c = dxn.l;
   protected static final fbu d = djm.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fbu e = djm.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fbu f = fbr.a(d, e);
   private static dxc g;

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   public static dxc b() {
      if (g == null) {
         g = dxd.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxb.a(dxg.a))
            .a('^', dxb.a(dxg.a(djo.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.d))))
            .a('>', dxb.a(dxg.a(djo.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.e))))
            .a('v', dxb.a(dxg.a(djo.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.c))))
            .a('<', dxb.a(dxg.a(djo.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
