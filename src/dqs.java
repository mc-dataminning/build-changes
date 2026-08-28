import com.mojang.serialization.MapCodec;

public abstract class dqs extends dmr {
   public static final ebr<jb> e = ebj.T;

   protected dqs(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqs> a();

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
