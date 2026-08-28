import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eex implements eep {
   public static final MapCodec<eex> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eep.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eex::new)
   );
   private final eep e;

   public eex(eep $$0) {
      this.e = $$0;
   }

   public boolean a(dhy $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eeq<?> a() {
      return eeq.k;
   }
}
