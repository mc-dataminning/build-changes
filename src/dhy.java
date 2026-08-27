import com.mojang.serialization.MapCodec;

public class dhy extends dkm {
   public static final MapCodec<dhy> a = b(dhy::new);

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(dpx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kw.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
