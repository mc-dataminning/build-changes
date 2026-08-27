import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class duc extends due {
   public static final Codec<duc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, duc::new));

   public duc(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dmz $$0) {
      return $$0.r();
   }

   @Override
   public dtu<?> a() {
      return dtu.f;
   }
}
