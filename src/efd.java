import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efd(ehp b, ebd c, bqp d, int e) implements efg {
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehp.a.fieldOf("state_provider").forGetter(efd::a),
               ebd.b.fieldOf("target").forGetter(efd::b),
               bqp.b(0, 8).fieldOf("radius").forGetter(efd::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(efd::d)
            )
            .apply($$0, efd::new)
   );

   public ehp a() {
      return this.b;
   }

   public ebd b() {
      return this.c;
   }

   public bqp c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
