import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzl implements dzd {
   public static final MapCodec<dzl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzd.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dzl::new)
   );
   private final dzd e;

   public dzl(dzd $$0) {
      this.e = $$0;
   }

   public boolean a(dcv $$0, iz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dze<?> a() {
      return dze.k;
   }
}
