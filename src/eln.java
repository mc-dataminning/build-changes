import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eln(enz b, ehn c, bti d, int e) implements elq {
   public static final Codec<eln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enz.a.fieldOf("state_provider").forGetter(eln::a),
               ehn.b.fieldOf("target").forGetter(eln::b),
               bti.b(0, 8).fieldOf("radius").forGetter(eln::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eln::d)
            )
            .apply($$0, eln::new)
   );

   public enz a() {
      return this.b;
   }

   public ehn b() {
      return this.c;
   }

   public bti c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
