import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ern extends erh {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ehd.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ern::new)
   );
   private final ehd.a c;
   private final int d;
   private final int e;

   private ern(ehd.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ern a(ehd.a $$0, int $$1, int $$2) {
      return new ern($$0, $$1, $$2);
   }

   @Override
   protected boolean a(erg $$0, azx $$1, iv $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public erj<?> b() {
      return erj.c;
   }
}
