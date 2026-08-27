import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egc extends efv {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, egc::new)
   );
   private final int c;

   private egc(int $$0) {
      this.c = $$0;
   }

   public static egc a(int $$0) {
      return new egc($$0);
   }

   @Override
   protected boolean a(efu $$0, ayg $$1, in $$2) {
      int $$3 = $$0.a(dvz.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dvz.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public efx<?> b() {
      return efx.d;
   }
}
