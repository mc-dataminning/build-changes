import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eft extends efm {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eft::new)
   );
   private final int c;

   private eft(int $$0) {
      this.c = $$0;
   }

   public static eft a(int $$0) {
      return new eft($$0);
   }

   @Override
   protected boolean a(efl $$0, ayd $$1, im $$2) {
      int $$3 = $$0.a(dvq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dvq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public efo<?> b() {
      return efo.d;
   }
}
