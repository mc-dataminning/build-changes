import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eie extends eif {
   public static final MapCodec<eie> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eie::new));

   public eie(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.e();
   }

   @Override
   public ehv<?> a() {
      return ehv.e;
   }
}
