import com.mojang.serialization.Codec;

public abstract class drr {
   public static final Codec<drr> a = jb.W.q().dispatch(drr::a, drs::a);

   public static dsa a(dez $$0) {
      return new dsa($$0);
   }

   public static dsa a(csl $$0) {
      return new dsa($$0.n());
   }

   protected abstract drs<?> a();

   public abstract dez a(aru var1, gu var2);
}
