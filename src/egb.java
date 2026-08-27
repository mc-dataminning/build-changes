import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egb extends efv {
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egb::new)
   );
   private final dvz.a c;
   private final int d;
   private final int e;

   private egb(dvz.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static egb a(dvz.a $$0, int $$1, int $$2) {
      return new egb($$0, $$1, $$2);
   }

   @Override
   protected boolean a(efu $$0, ayg $$1, in $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public efx<?> b() {
      return efx.c;
   }
}
