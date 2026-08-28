import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eef(egr b, eaf c, bpw d, int e) implements eei {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egr.a.fieldOf("state_provider").forGetter(eef::a),
               eaf.b.fieldOf("target").forGetter(eef::b),
               bpw.b(0, 8).fieldOf("radius").forGetter(eef::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eef::d)
            )
            .apply($$0, eef::new)
   );

   public egr a() {
      return this.b;
   }

   public eaf b() {
      return this.c;
   }

   public bpw c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
