import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebe(edq b, dxg c, bor d, int e) implements ebh {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edq.a.fieldOf("state_provider").forGetter(ebe::a),
               dxg.b.fieldOf("target").forGetter(ebe::b),
               bor.b(0, 8).fieldOf("radius").forGetter(ebe::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ebe::d)
            )
            .apply($$0, ebe::new)
   );

   public edq a() {
      return this.b;
   }

   public dxg b() {
      return this.c;
   }

   public bor c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
