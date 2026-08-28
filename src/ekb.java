import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekb extends eju {
   public static final MapCodec<ekb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ekb::new)
   );
   private final int c;

   private ekb(int $$0) {
      this.c = $$0;
   }

   public static ekb a(int $$0) {
      return new ekb($$0);
   }

   @Override
   protected boolean a(ejt $$0, azk $$1, je $$2) {
      int $$3 = $$0.a(dzw.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dzw.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ejw<?> b() {
      return ejw.d;
   }
}
