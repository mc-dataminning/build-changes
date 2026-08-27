import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eby(eek b, dya c, boz d, int e) implements ecb {
   public static final Codec<eby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eek.a.fieldOf("state_provider").forGetter(eby::a),
               dya.b.fieldOf("target").forGetter(eby::b),
               boz.b(0, 8).fieldOf("radius").forGetter(eby::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eby::d)
            )
            .apply($$0, eby::new)
   );

   public eek a() {
      return this.b;
   }

   public dya b() {
      return this.c;
   }

   public boz c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
