import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ehx extends ehy {
   public static final MapCodec<ehx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehx::new));

   public ehx(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.e();
   }

   @Override
   public eho<?> a() {
      return eho.e;
   }
}
