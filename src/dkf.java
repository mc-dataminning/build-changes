import com.mojang.serialization.MapCodec;

public class dkf extends dcv {
   public static final MapCodec<dkf> b = b(dkf::new);
   public static final dqp c = dqo.z;

   @Override
   protected MapCodec<? extends dkf> a() {
      return b;
   }

   protected dkf(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dpy $$0) {
      return $$0.a(avo.bz);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }
}
