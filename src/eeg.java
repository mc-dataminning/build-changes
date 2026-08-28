import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeg implements edy {
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edy.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eeg::new)
   );
   private final edy e;

   public eeg(edy $$0) {
      this.e = $$0;
   }

   public boolean a(dhf $$0, ji $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public edz<?> a() {
      return edz.k;
   }
}
