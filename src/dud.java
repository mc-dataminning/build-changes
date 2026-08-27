import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dud extends due {
   public static final Codec<dud> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dud::new));

   public dud(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dmz $$0) {
      return $$0.e();
   }

   @Override
   public dtu<?> a() {
      return dtu.e;
   }
}
