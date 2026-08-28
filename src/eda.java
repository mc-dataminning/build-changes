import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eda(efm b, dzc c, bqa d, int e) implements edd {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efm.a.fieldOf("state_provider").forGetter(eda::a),
               dzc.b.fieldOf("target").forGetter(eda::b),
               bqa.b(0, 8).fieldOf("radius").forGetter(eda::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eda::d)
            )
            .apply($$0, eda::new)
   );

   public efm a() {
      return this.b;
   }

   public dzc b() {
      return this.c;
   }

   public bqa c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
