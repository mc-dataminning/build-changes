import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duq extends duj {
   public static final Codec<duq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, duq::new)
   );
   private final int c;

   private duq(int $$0) {
      this.c = $$0;
   }

   public static duq a(int $$0) {
      return new duq($$0);
   }

   @Override
   protected boolean a(dui $$0, arx $$1, gw $$2) {
      int $$3 = $$0.a(dkn.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dkn.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dul<?> b() {
      return dul.d;
   }
}
