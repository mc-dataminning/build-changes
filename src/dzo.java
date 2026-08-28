import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzo implements dzg {
   public static final MapCodec<dzo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzg.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzo::new)
   );
   private final dzg e;

   public dzo(dzg $$0) {
      this.e = $$0;
   }

   public boolean a(dcz $$0, ja $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dzh<?> a() {
      return dzh.k;
   }
}
