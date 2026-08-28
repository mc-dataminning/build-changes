import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eid extends ehw {
   public static final MapCodec<eid> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eid::new)
   );
   private final int c;

   private eid(int $$0) {
      this.c = $$0;
   }

   public static eid a(int $$0) {
      return new eid($$0);
   }

   @Override
   protected boolean a(ehv $$0, aym $$1, ja $$2) {
      int $$3 = $$0.a(dxz.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxz.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ehy<?> b() {
      return ehy.d;
   }
}
