import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eei implements eea {
   public static final MapCodec<eei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eea.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eei::new)
   );
   private final eea e;

   public eei(eea $$0) {
      this.e = $$0;
   }

   public boolean a(dhh $$0, ji $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eeb<?> a() {
      return eeb.k;
   }
}
