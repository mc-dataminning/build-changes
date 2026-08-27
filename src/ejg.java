import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejg extends eiz {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ejg::new)
   );
   private final int c;

   private ejg(int $$0) {
      this.c = $$0;
   }

   public static ejg a(int $$0) {
      return new ejg($$0);
   }

   @Override
   protected boolean a(eiy $$0, ayt $$1, ir $$2) {
      int $$3 = $$0.a(dyu.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyu.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ejb<?> b() {
      return ejb.d;
   }
}
