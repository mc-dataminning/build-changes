import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dna extends dnc {
   public static final Codec<dna> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dna::new));

   public dna(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dgb $$0) {
      return $$0.r();
   }

   @Override
   public dms<?> a() {
      return dms.f;
   }
}
