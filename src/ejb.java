import com.mojang.serialization.Codec;

public abstract class ejb {
   public static final Codec<ejb> a = lz.T.q().dispatch(ejb::a, ejc::a);

   public static ejk a(dvv $$0) {
      return new ejk($$0);
   }

   public static ejk a(diq $$0) {
      return new ejk($$0.m());
   }

   protected abstract ejc<?> a();

   public abstract dvv a(azu var1, jh var2);
}
