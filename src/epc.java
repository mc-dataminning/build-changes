import com.mojang.serialization.Codec;

public abstract class epc {
   public static final Codec<epc> a = mh.T.q().dispatch(epc::a, epd::a);

   public static epl a(ebq $$0) {
      return new epl($$0);
   }

   public static epl a(dno $$0) {
      return new epl($$0.m());
   }

   protected abstract epd<?> a();

   public abstract ebq a(bai var1, iw var2);
}
