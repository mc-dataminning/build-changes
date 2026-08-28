import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehk extends ehq {
   final axr<dma> a;
   public static final MapCodec<ehk> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.a(mg.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ehk::new)
   );

   protected ehk(jz $$0, axr<dma> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ehg<?> a() {
      return ehg.b;
   }
}
