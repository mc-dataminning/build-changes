import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ebn extends ebo {
   public static final MapCodec<ebn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ebn::new));

   public ebn(ki $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.e();
   }

   @Override
   public ebe<?> a() {
      return ebe.e;
   }
}
