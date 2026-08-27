import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dul extends due {
   public static final Codec<dul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dul::new)
   );
   private final int c;

   private dul(int $$0) {
      this.c = $$0;
   }

   public static dul a(int $$0) {
      return new dul($$0);
   }

   @Override
   protected boolean a(dud $$0, aru $$1, gu $$2) {
      int $$3 = $$0.a(dki.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dki.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dug<?> b() {
      return dug.d;
   }
}
