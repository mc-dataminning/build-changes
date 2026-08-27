import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpo(dsa b, dlq c, bfv d, int e) implements dpr {
   public static final Codec<dpo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsa.a.fieldOf("state_provider").forGetter(dpo::a),
               dlq.b.fieldOf("target").forGetter(dpo::b),
               bfv.b(0, 8).fieldOf("radius").forGetter(dpo::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpo::d)
            )
            .apply($$0, dpo::new)
   );

   public dsa a() {
      return this.b;
   }

   public dlq b() {
      return this.c;
   }

   public bfv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
