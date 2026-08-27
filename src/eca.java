import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eca(eem b, dyc c, bpb d, int e) implements ecd {
   public static final Codec<eca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eem.a.fieldOf("state_provider").forGetter(eca::a),
               dyc.b.fieldOf("target").forGetter(eca::b),
               bpb.b(0, 8).fieldOf("radius").forGetter(eca::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eca::d)
            )
            .apply($$0, eca::new)
   );

   public eem a() {
      return this.b;
   }

   public dyc b() {
      return this.c;
   }

   public bpb c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
