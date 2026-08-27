import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dnb extends dnc {
   public static final Codec<dnb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dnb::new));

   public dnb(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dgb $$0) {
      return $$0.e();
   }

   @Override
   public dms<?> a() {
      return dms.e;
   }
}
