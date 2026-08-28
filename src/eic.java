import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eic implements ehu {
   public static final MapCodec<eic> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehu.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eic::new)
   );
   private final ehu e;

   public eic(ehu $$0) {
      this.e = $$0;
   }

   public boolean a(dkg $$0, iv $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ehv<?> a() {
      return ehv.k;
   }
}
