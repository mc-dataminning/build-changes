import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqp(dtb b, dmr c, bhg d, int e) implements dqs {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtb.a.fieldOf("state_provider").forGetter(dqp::a),
               dmr.b.fieldOf("target").forGetter(dqp::b),
               bhg.b(0, 8).fieldOf("radius").forGetter(dqp::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dqp::d)
            )
            .apply($$0, dqp::new)
   );

   public dtb a() {
      return this.b;
   }

   public dmr b() {
      return this.c;
   }

   public bhg c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
