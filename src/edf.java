import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class edf implements ecx {
   public static final MapCodec<edf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecx.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, edf::new)
   );
   private final ecx e;

   public edf(ecx $$0) {
      this.e = $$0;
   }

   public boolean a(dgk $$0, jh $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public ecy<?> a() {
      return ecy.k;
   }
}
