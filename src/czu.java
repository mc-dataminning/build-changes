import com.mojang.serialization.MapCodec;

public abstract class czu extends cvz {
   public static final djj aE = djf.R;

   protected czu(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czu> a();

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(aE, $$1.a($$0.c(aE)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(aE)));
   }
}
