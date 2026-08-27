import com.mojang.serialization.MapCodec;

public abstract class dal extends cwq {
   public static final dkb aE = djx.R;

   protected dal(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dal> a();

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
