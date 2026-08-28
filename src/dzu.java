import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzu extends dzy {
   private final jn<eoi> e;
   public static final MapCodec<dzu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzu::new)
   );

   public dzu(ke $$0, jn<eoi> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsl $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzo<?> a() {
      return dzo.c;
   }
}
