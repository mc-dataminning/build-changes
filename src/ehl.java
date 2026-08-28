import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehl extends ehq {
   private final ji<dma> e;
   public static final MapCodec<ehl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ehl::new)
   );

   public ehl(jz $$0, ji<dma> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ehg<?> a() {
      return ehg.a;
   }
}
