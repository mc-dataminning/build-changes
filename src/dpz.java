import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpz(dsl b, dmb c, bgf d, int e) implements dqc {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsl.a.fieldOf("state_provider").forGetter(dpz::a),
               dmb.b.fieldOf("target").forGetter(dpz::b),
               bgf.b(0, 8).fieldOf("radius").forGetter(dpz::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpz::d)
            )
            .apply($$0, dpz::new)
   );

   public dsl a() {
      return this.b;
   }

   public dmb b() {
      return this.c;
   }

   public bgf c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
