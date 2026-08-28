import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erq extends erj {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, erq::new)
   );
   private final int c;

   private erq(int $$0) {
      this.c = $$0;
   }

   public static erq a(int $$0) {
      return new erq($$0);
   }

   @Override
   protected boolean a(eri $$0, azz $$1, iw $$2) {
      int $$3 = $$0.a(ehf.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ehf.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public erl<?> b() {
      return erl.d;
   }
}
