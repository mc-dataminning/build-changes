import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyi implements dya {
   public static final MapCodec<dyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dya.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dyi::new)
   );
   private final dya e;

   public dyi(dya $$0) {
      this.e = $$0;
   }

   public boolean a(dbs $$0, io $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dyb<?> a() {
      return dyb.k;
   }
}
