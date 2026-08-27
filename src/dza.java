import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dza extends dyu {
   public static final Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               doy.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dza::new)
   );
   private final doy.a c;
   private final int d;
   private final int e;

   private dza(doy.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static dza a(doy.a $$0, int $$1, int $$2) {
      return new dza($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dyt $$0, auw $$1, hx $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public dyw<?> b() {
      return dyw.c;
   }
}
