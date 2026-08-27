import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfp extends dgr {
   public static final dqw<dqj> K = dqo.U;

   protected dfp(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfp> a();

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(czx $$0, im $$1, ir $$2) {
      im $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      for (ir $$1 : $$0.f()) {
         dpy $$2;
         if ($$1.o() == ir.a.b) {
            $$2 = this.n().a(K, $$1 == ir.b ? dqj.c : dqj.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dqj.b).a(aE, $$1.g());
         }

         if ($$2.a((czx)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ir m(dpy $$0) {
      switch ((dqj)$$0.c(K)) {
         case c:
            return ir.a;
         case a:
            return ir.b;
         default:
            return $$0.c(aE);
      }
   }
}
