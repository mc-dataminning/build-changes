import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc extends eiv {
   public static final MapCodec<ejc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ejc::new)
   );
   private final int c;

   private ejc(int $$0) {
      this.c = $$0;
   }

   public static ejc a(int $$0) {
      return new ejc($$0);
   }

   @Override
   protected boolean a(eiu $$0, ayw $$1, jd $$2) {
      int $$3 = $$0.a(dyy.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyy.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eix<?> b() {
      return eix.d;
   }
}
