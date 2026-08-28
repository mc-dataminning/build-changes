import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eko extends eki {
   public static final MapCodec<eko> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eak.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eko::new)
   );
   private final eak.a c;
   private final int d;
   private final int e;

   private eko(eak.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static eko a(eak.a $$0, int $$1, int $$2) {
      return new eko($$0, $$1, $$2);
   }

   @Override
   protected boolean a(ekh $$0, azl $$1, je $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public ekk<?> b() {
      return ekk.c;
   }
}
