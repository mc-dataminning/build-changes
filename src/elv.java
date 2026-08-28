import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elv extends elo {
   public static final MapCodec<elv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, elv::new)
   );
   private final int c;

   private elv(int $$0) {
      this.c = $$0;
   }

   public static elv a(int $$0) {
      return new elv($$0);
   }

   @Override
   protected boolean a(eln $$0, azu $$1, jh $$2) {
      int $$3 = $$0.a(ebq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ebq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public elq<?> b() {
      return elq.d;
   }
}
