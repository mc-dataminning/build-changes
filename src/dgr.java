import com.mojang.serialization.MapCodec;

public abstract class dgr extends dcv {
   public static final dqs aE = dqo.R;

   protected dgr(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgr> a();

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
