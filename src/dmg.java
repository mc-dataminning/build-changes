import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmg extends dmk {
   private final hk<eal> e;
   public static final Codec<dmg> a = RecordCodecBuilder.create($$0 -> a($$0).and(hv.a(je.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dmg::new));

   public dmg(ib $$0, hk<eal> $$1) {
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
