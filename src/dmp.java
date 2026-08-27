import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmp(dpb b, dir c, bdc d, int e) implements dms {
   public static final Codec<dmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpb.a.fieldOf("state_provider").forGetter(dmp::a),
               dir.b.fieldOf("target").forGetter(dmp::b),
               bdc.b(0, 8).fieldOf("radius").forGetter(dmp::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dmp::d)
            )
            .apply($$0, dmp::new)
   );

   public dpb a() {
      return this.b;
   }

   public dir b() {
      return this.c;
   }

   public bdc c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
