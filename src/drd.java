import com.mojang.serialization.MapCodec;

public abstract class drd extends dnc {
   public static final ecc<jb> e = ebu.T;

   protected drd(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends drd> a();

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
