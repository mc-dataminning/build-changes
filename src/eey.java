import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eey implements eeq {
   public static final MapCodec<eey> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eey::new)
   );
   private final eeq e;

   public eey(eeq $$0) {
      this.e = $$0;
   }

   public boolean a(dhx $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eer<?> a() {
      return eer.k;
   }
}
