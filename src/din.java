import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class din extends dfy {
   public static final MapCodec<din> a = b(din::new);
   public static final dtw b = dju.aE;
   public static final dtt c = dts.h;
   protected static final ext d = dfy.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ext e = dfy.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ext f = exq.a(d, e);
   private static dth g;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   public static dth b() {
      if (g == null) {
         g = dti.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dtg.a(dtl.a))
            .a('^', dtg.a(dtl.a(dga.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.d))))
            .a('>', dtg.a(dtl.a(dga.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.e))))
            .a('v', dtg.a(dtl.a(dga.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.c))))
            .a('<', dtg.a(dtl.a(dga.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ji.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
