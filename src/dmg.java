import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmg extends dmk {
   private final hi<eal> e;
   public static final Codec<dmg> a = RecordCodecBuilder.create($$0 -> a($$0).and(hs.a(jc.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dmg::new));

   public dmg(hy $$0, hi<eal> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dma<?> a() {
      return dma.c;
   }
}
