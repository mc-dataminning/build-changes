import com.mojang.serialization.Codec;

public abstract class enj {
   public static final Codec<enj> a = mf.T.q().dispatch(enj::a, enk::a);

   public static ens a(dzz $$0) {
      return new ens($$0);
   }

   public static ens a(dma $$0) {
      return new ens($$0.m());
   }

   protected abstract enk<?> a();

   public abstract dzz a(azv var1, iu var2);
}
