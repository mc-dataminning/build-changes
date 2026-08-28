import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elo extends elh {
   public static final MapCodec<elo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, elo::new)
   );
   private final int c;

   private elo(int $$0) {
      this.c = $$0;
   }

   public static elo a(int $$0) {
      return new elo($$0);
   }

   @Override
   protected boolean a(elg $$0, azv $$1, jh $$2) {
      int $$3 = $$0.a(ebj.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ebj.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public elj<?> b() {
      return elj.d;
   }
}
