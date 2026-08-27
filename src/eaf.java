import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eaf(ecr b, dwh c, bnk d, int e) implements eai {
   public static final Codec<eaf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecr.a.fieldOf("state_provider").forGetter(eaf::a),
               dwh.b.fieldOf("target").forGetter(eaf::b),
               bnk.b(0, 8).fieldOf("radius").forGetter(eaf::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eaf::d)
            )
            .apply($$0, eaf::new)
   );

   public ecr a() {
      return this.b;
   }

   public dwh b() {
      return this.c;
   }

   public bnk c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
