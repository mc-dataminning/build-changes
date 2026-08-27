import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyk implements dyc {
   public static final MapCodec<dyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dyk::new)
   );
   private final dyc e;

   public dyk(dyc $$0) {
      this.e = $$0;
   }

   public boolean a(dbu $$0, io $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dyd<?> a() {
      return dyd.k;
   }
}
