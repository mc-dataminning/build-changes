import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeh implements edz {
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edz.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eeh::new)
   );
   private final edz e;

   public eeh(edz $$0) {
      this.e = $$0;
   }

   public boolean a(dhg $$0, ji $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eea<?> a() {
      return eea.k;
   }
}
