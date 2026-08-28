import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmt extends dkd {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyf c = dye.l;
   protected static final fcl d = dkd.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fcl e = dkd.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fcl f = fci.a(d, e);
   private static dxt g;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   public static dxt b() {
      if (g == null) {
         g = dxu.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxs.a(dxx.a))
            .a('^', dxs.a(dxx.a(dkf.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dxs.a(dxx.a(dkf.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dxs.a(dxx.a(dkf.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dxs.a(dxx.a(dkf.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
