import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehn implements ehf {
   public static final MapCodec<ehn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehf.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ehn::new)
   );
   private final ehf e;

   public ehn(ehf $$0) {
      this.e = $$0;
   }

   public boolean a(dju $$0, iu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ehg<?> a() {
      return ehg.k;
   }
}
