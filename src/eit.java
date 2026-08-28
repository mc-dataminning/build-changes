import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eit extends eix {
   private final jk<exp> e;
   public static final MapCodec<eit> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jv.a(mi.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eit::new)
   );

   public eit(kb $$0, jk<exp> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ein<?> a() {
      return ein.c;
   }
}
