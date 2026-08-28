import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehe extends ehr {
   public static final MapCodec<ehe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzc.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehe::new)
   );
   private final dzc c;

   private ehe(dzc $$0) {
      this.c = $$0;
   }

   public static ehe a(dzc $$0) {
      return new ehe($$0);
   }

   @Override
   protected boolean a(ehq $$0, azh $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eht<?> b() {
      return eht.a;
   }
}
