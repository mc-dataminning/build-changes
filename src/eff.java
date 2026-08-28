import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eff implements eex {
   public static final MapCodec<eff> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eex.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eff::new)
   );
   private final eex e;

   public eff(eex $$0) {
      this.e = $$0;
   }

   public boolean a(dig $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eey<?> a() {
      return eey.k;
   }
}
