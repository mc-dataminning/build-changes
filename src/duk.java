import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dud {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, duk::new)
   );
   private final int c;

   private duk(int $$0) {
      this.c = $$0;
   }

   public static duk a(int $$0) {
      return new duk($$0);
   }

   @Override
   protected boolean a(duc $$0, art $$1, gv $$2) {
      int $$3 = $$0.a(dkh.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dkh.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public duf<?> b() {
      return duf.d;
   }
}
