import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efd extends eew {
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, efd::new)
   );
   private final int c;

   private efd(int $$0) {
      this.c = $$0;
   }

   public static efd a(int $$0) {
      return new efd($$0);
   }

   @Override
   protected boolean a(eev $$0, axt $$1, id $$2) {
      int $$3 = $$0.a(dva.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dva.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eey<?> b() {
      return eey.d;
   }
}
