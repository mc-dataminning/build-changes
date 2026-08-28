import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dma extends djk {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dxs<jn> b = dni.aF;
   public static final dxm c = dxl.l;
   protected static final fbs d = djk.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fbs e = djk.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fbs f = fbp.a(d, e);
   private static dxa g;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   public static dxa b() {
      if (g == null) {
         g = dxb.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dwz.a(dxe.a))
            .a('^', dwz.a(dxe.a(djm.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.d))))
            .a('>', dwz.a(dxe.a(djm.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.e))))
            .a('v', dwz.a(dxe.a(djm.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.c))))
            .a('<', dwz.a(dxe.a(djm.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
