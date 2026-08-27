import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dup extends dui {
   public static final Codec<dup> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dup::new)
   );
   private final int c;

   private dup(int $$0) {
      this.c = $$0;
   }

   public static dup a(int $$0) {
      return new dup($$0);
   }

   @Override
   protected boolean a(duh $$0, ash $$1, gw $$2) {
      int $$3 = $$0.a(dkm.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dkm.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public duk<?> b() {
      return duk.d;
   }
}
