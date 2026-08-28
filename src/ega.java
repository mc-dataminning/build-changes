import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ega implements efs {
   public static final MapCodec<ega> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efs.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ega::new)
   );
   private final efs e;

   public ega(efs $$0) {
      this.e = $$0;
   }

   public boolean a(dio $$0, jj $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eft<?> a() {
      return eft.k;
   }
}
