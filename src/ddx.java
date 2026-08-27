import com.mojang.serialization.MapCodec;

public class ddx extends dhf {
   public static final MapCodec<ddx> a = b(ddx::new);

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(dpx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         im $$4 = $$2.d();
         dpy $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ir.b)) {
            axz.a($$1, $$2, $$3, kw.F);
         }
      }
   }
}
