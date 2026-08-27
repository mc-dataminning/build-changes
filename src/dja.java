import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dja extends djc {
   public static final Codec<dja> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dja::new));

   public dja(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.r();
   }

   @Override
   public dis<?> a() {
      return dis.f;
   }
}
