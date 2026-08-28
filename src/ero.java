import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ero extends erh {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ero::new)
   );
   private final int c;

   private ero(int $$0) {
      this.c = $$0;
   }

   public static ero a(int $$0) {
      return new ero($$0);
   }

   @Override
   protected boolean a(erg $$0, azx $$1, iv $$2) {
      int $$3 = $$0.a(ehd.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ehd.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public erj<?> b() {
      return erj.d;
   }
}
