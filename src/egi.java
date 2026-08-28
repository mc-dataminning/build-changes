import com.mojang.serialization.Codec;

public abstract class egi {
   public static final Codec<egi> a = lt.T.r().dispatch(egi::a, egj::a);

   public static egr a(dtc $$0) {
      return new egr($$0);
   }

   public static egr a(dfy $$0) {
      return new egr($$0.o());
   }

   protected abstract egj<?> a();

   public abstract dtc a(ayw var1, jd var2);
}
