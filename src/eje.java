import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eje implements eiw {
   public static final MapCodec<eje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eiw.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eje::new)
   );
   private final eiw e;

   public eje(eiw $$0) {
      this.e = $$0;
   }

   public boolean a(dli $$0, iw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eix<?> a() {
      return eix.k;
   }
}
