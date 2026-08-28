import com.mojang.serialization.Codec;

public abstract class egj {
   public static final Codec<egj> a = lt.T.r().dispatch(egj::a, egk::a);

   public static egs a(dtc $$0) {
      return new egs($$0);
   }

   public static egs a(dfy $$0) {
      return new egs($$0.o());
   }

   protected abstract egk<?> a();

   public abstract dtc a(ayw var1, jd var2);
}
