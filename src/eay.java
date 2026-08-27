import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eay extends ear {
   public static final Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eay::new)
   );
   private final int c;

   private eay(int $$0) {
      this.c = $$0;
   }

   public static eay a(int $$0) {
      return new eay($$0);
   }

   @Override
   protected boolean a(eaq $$0, awp $$1, hz $$2) {
      int $$3 = $$0.a(dqv.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dqv.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eat<?> b() {
      return eat.d;
   }
}
