import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enz extends eom {
   public static final MapCodec<enz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efs.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, enz::new)
   );
   private final efs c;

   private enz(efs $$0) {
      this.c = $$0;
   }

   public static enz a(efs $$0) {
      return new enz($$0);
   }

   @Override
   protected boolean a(eol $$0, azs $$1, jj $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eoo<?> b() {
      return eoo.a;
   }
}
