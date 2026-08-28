import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlu extends dni {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dlu::new)
   );
   private final ayy b;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(ayy $$0, dxt.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dxu $$0, dgm $$1, jh $$2) {
      return this.b.a();
   }
}
