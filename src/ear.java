import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ear extends eak {
   public static final Codec<ear> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ear::new)
   );
   private final int c;

   private ear(int $$0) {
      this.c = $$0;
   }

   public static ear a(int $$0) {
      return new ear($$0);
   }

   @Override
   protected boolean a(eaj $$0, awo $$1, hz $$2) {
      int $$3 = $$0.a(dqo.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dqo.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eam<?> b() {
      return eam.d;
   }
}
