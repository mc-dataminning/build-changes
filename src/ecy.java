import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecy implements ecq {
   public static final MapCodec<ecy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecq.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ecy::new)
   );
   private final ecq e;

   public ecy(ecq $$0) {
      this.e = $$0;
   }

   public boolean a(dgd $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ecr<?> a() {
      return ecr.k;
   }
}
