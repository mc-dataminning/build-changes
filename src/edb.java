import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edb(efn b, dzd c, bqb d, int e) implements ede {
   public static final Codec<edb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efn.a.fieldOf("state_provider").forGetter(edb::a),
               dzd.b.fieldOf("target").forGetter(edb::b),
               bqb.b(0, 8).fieldOf("radius").forGetter(edb::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(edb::d)
            )
            .apply($$0, edb::new)
   );

   public efn a() {
      return this.b;
   }

   public dzd b() {
      return this.c;
   }

   public bqb c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
