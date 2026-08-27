import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class djb extends djc {
   public static final Codec<djb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, djb::new));

   public djb(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.e();
   }

   @Override
   public dis<?> a() {
      return dis.e;
   }
}
