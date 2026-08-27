import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet extends een {
   public static final Codec<eet> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dur.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eet::new)
   );
   private final dur.a c;
   private final int d;
   private final int e;

   private eet(dur.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static eet a(dur.a $$0, int $$1, int $$2) {
      return new eet($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eem $$0, axr $$1, ib $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public eep<?> b() {
      return eep.c;
   }
}
