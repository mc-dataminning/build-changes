import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebz implements ebr {
   public static final MapCodec<ebz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebr.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ebz::new)
   );
   private final ebr e;

   public ebz(ebr $$0) {
      this.e = $$0;
   }

   public boolean a(dfd $$0, je $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ebs<?> a() {
      return ebs.k;
   }
}
