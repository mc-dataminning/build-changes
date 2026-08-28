import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiy extends eis {
   public static final MapCodec<eiy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyv.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
               Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiy::new)
   );
   private final dyv.a c;
   private final int d;
   private final int e;

   private eiy(dyv.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static eiy a(dyv.a $$0, int $$1, int $$2) {
      return new eiy($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eir $$0, ayv $$1, jd $$2) {
      long $$3 = (long)$$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + (long)this.d;
      long $$5 = $$3 + (long)this.e;
      return $$4 <= (long)$$2.v() && (long)$$2.v() <= $$5;
   }

   @Override
   public eiu<?> b() {
      return eiu.c;
   }
}
