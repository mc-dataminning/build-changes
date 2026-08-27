import com.mojang.serialization.MapCodec;

public class dgo extends dcv {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final ety c = dcv.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dqw<it> b = dqo.T;

   public dgo(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.k));
   }

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.k();
      ir $$2;
      if ($$1.o() == ir.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ir.b;
      }

      return this.n().a(b, it.a($$1, $$2));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
