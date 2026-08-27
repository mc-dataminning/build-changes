import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtu(dwg b, dpw c, bjf d, int e) implements dtx {
   public static final Codec<dtu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwg.a.fieldOf("state_provider").forGetter(dtu::a),
               dpw.b.fieldOf("target").forGetter(dtu::b),
               bjf.b(0, 8).fieldOf("radius").forGetter(dtu::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dtu::d)
            )
            .apply($$0, dtu::new)
   );

   public dwg a() {
      return this.b;
   }

   public dpw b() {
      return this.c;
   }

   public bjf c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
