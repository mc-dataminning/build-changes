import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends dbq {
   public static final MapCodec<dkc> c = b(dkc::new);

   @Override
   public MapCodec<dkc> a() {
      return c;
   }

   protected dkc(dpx.d $$0) {
      super($$0);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$0, $$2, dnf.B);
   }

   @Override
   protected void a(czu $$0, im $$1, ckl $$2) {
      dnd $$3 = $$0.c_($$1);
      if ($$3 instanceof doq) {
         $$2.a((bou)$$3);
         $$2.a(avj.at);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, auz.xV, ava.e, 1.0F, 1.0F, false);
         }

         $$1.a(kw.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
