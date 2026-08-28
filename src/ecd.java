import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecd implements ebv {
   public static final MapCodec<ecd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ecd::new)
   );
   private final ebv e;

   public ecd(ebv $$0) {
      this.e = $$0;
   }

   public boolean a(dfg $$0, jf $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ebw<?> a() {
      return ebw.k;
   }
}
