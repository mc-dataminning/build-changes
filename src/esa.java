import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class esa extends ert {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, esa::new)
   );
   private final int c;

   private esa(int $$0) {
      this.c = $$0;
   }

   public static esa a(int $$0) {
      return new esa($$0);
   }

   @Override
   protected boolean a(ers $$0, bai $$1, iw $$2) {
      int $$3 = $$0.a(ehp.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ehp.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public erv<?> b() {
      return erv.d;
   }
}
