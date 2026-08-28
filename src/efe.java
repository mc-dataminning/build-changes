import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efe implements eew {
   public static final MapCodec<efe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eew.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, efe::new)
   );
   private final eew e;

   public efe(eew $$0) {
      this.e = $$0;
   }

   public boolean a(dif $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eex<?> a() {
      return eex.k;
   }
}
