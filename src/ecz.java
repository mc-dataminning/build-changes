import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecz(efl b, dzb c, bpz d, int e) implements edc {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efl.a.fieldOf("state_provider").forGetter(ecz::a),
               dzb.b.fieldOf("target").forGetter(ecz::b),
               bpz.b(0, 8).fieldOf("radius").forGetter(ecz::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ecz::d)
            )
            .apply($$0, ecz::new)
   );

   public efl a() {
      return this.b;
   }

   public dzb b() {
      return this.c;
   }

   public bpz c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
