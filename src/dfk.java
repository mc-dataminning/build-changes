import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dfk extends dcv {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final dqs b = dgr.aE;
   public static final dqp c = dqo.h;
   protected static final ety d = dcv.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ety e = dcv.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ety f = etv.a(d, e);
   private static dqd g;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   public static dqd b() {
      if (g == null) {
         g = dqe.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dqc.a(dqh.a))
            .a('^', dqc.a(dqh.a(dcx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ir.d))))
            .a('>', dqc.a(dqh.a(dcx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ir.e))))
            .a('v', dqc.a(dqh.a(dcx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ir.c))))
            .a('<', dqc.a(dqh.a(dcx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ir.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
