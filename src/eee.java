import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eee(egq b, eaf c, bpw d, int e) implements eeh {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egq.a.fieldOf("state_provider").forGetter(eee::a),
               eaf.b.fieldOf("target").forGetter(eee::b),
               bpw.b(0, 8).fieldOf("radius").forGetter(eee::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eee::d)
            )
            .apply($$0, eee::new)
   );

   public egq a() {
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
