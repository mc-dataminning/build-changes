import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drk(dtw b, dnm c, bhv d, int e) implements drn {
   public static final Codec<drk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtw.a.fieldOf("state_provider").forGetter(drk::a),
               dnm.b.fieldOf("target").forGetter(drk::b),
               bhv.b(0, 8).fieldOf("radius").forGetter(drk::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(drk::d)
            )
            .apply($$0, drk::new)
   );

   public dtw a() {
      return this.b;
   }

   public dnm b() {
      return this.c;
   }

   public bhv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
