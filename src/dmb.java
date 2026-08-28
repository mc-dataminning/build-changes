import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmb extends djl {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final dxt<jn> b = dnj.aF;
   public static final dxn c = dxm.l;
   protected static final fbt d = djl.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fbt e = djl.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fbt f = fbq.a(d, e);
   private static dxb g;

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   public static dxb b() {
      if (g == null) {
         g = dxc.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxa.a(dxf.a))
            .a('^', dxa.a(dxf.a(djn.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.d))))
            .a('>', dxa.a(dxf.a(djn.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.e))))
            .a('v', dxa.a(dxf.a(djn.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.c))))
            .a('<', dxa.a(dxf.a(djn.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
