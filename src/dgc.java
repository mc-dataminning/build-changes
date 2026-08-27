import com.mojang.serialization.MapCodec;

public abstract class dgc extends dch {
   public static final dqc aE = dpy.R;

   protected dgc(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgc> a();

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
