import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eiu implements eim {
   public static final MapCodec<eiu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eim.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eiu::new)
   );
   private final eim e;

   public eiu(eim $$0) {
      this.e = $$0;
   }

   public boolean a(dky $$0, iw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ein<?> a() {
      return ein.k;
   }
}
