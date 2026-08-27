import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvt(dyf b, drv c, bkz d, int e) implements dvw {
   public static final Codec<dvt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyf.a.fieldOf("state_provider").forGetter(dvt::a),
               drv.b.fieldOf("target").forGetter(dvt::b),
               bkz.b(0, 8).fieldOf("radius").forGetter(dvt::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dvt::d)
            )
            .apply($$0, dvt::new)
   );

   public dyf a() {
      return this.b;
   }

   public drv b() {
      return this.c;
   }

   public bkz c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
