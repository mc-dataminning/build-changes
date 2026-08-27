import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpx(dsj b, dlz c, bgd d, int e) implements dqa {
   public static final Codec<dpx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsj.a.fieldOf("state_provider").forGetter(dpx::a),
               dlz.b.fieldOf("target").forGetter(dpx::b),
               bgd.b(0, 8).fieldOf("radius").forGetter(dpx::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpx::d)
            )
            .apply($$0, dpx::new)
   );

   public dsj a() {
      return this.b;
   }

   public dlz b() {
      return this.c;
   }

   public bgd c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
