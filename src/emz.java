import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emz extends ems {
   public static final MapCodec<emz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, emz::new)
   );
   private final int c;

   private emz(int $$0) {
      this.c = $$0;
   }

   public static emz a(int $$0) {
      return new emz($$0);
   }

   @Override
   protected boolean a(emr $$0, azh $$1, ji $$2) {
      int $$3 = $$0.a(ecs.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ecs.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public emu<?> b() {
      return emu.d;
   }
}
