import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dto(dwa b, dpq c, bja d, int e) implements dtr {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwa.a.fieldOf("state_provider").forGetter(dto::a),
               dpq.b.fieldOf("target").forGetter(dto::b),
               bja.b(0, 8).fieldOf("radius").forGetter(dto::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dto::d)
            )
            .apply($$0, dto::new)
   );

   public dwa a() {
      return this.b;
   }

   public dpq b() {
      return this.c;
   }

   public bja c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
