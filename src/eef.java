import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eef implements edx {
   public static final MapCodec<eef> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edx.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eef::new)
   );
   private final edx e;

   public eef(edx $$0) {
      this.e = $$0;
   }

   public boolean a(dhe $$0, ji $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public edy<?> a() {
      return edy.k;
   }
}
