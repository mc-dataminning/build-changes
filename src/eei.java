import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eei extends eej {
   public static final MapCodec<eei> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eei::new));

   public eei(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.e();
   }

   @Override
   public edz<?> a() {
      return edz.e;
   }
}
