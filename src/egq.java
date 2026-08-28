import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egq(ejc b, ecq c, brm d, int e) implements egt {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejc.a.fieldOf("state_provider").forGetter(egq::a),
               ecq.b.fieldOf("target").forGetter(egq::b),
               brm.b(0, 8).fieldOf("radius").forGetter(egq::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(egq::d)
            )
            .apply($$0, egq::new)
   );

   public ejc a() {
      return this.b;
   }

   public ecq b() {
      return this.c;
   }

   public brm c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
