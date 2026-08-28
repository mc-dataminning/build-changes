import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eip(elb b, eep c, bsj d, int e) implements eis {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elb.a.fieldOf("state_provider").forGetter(eip::a),
               eep.b.fieldOf("target").forGetter(eip::b),
               bsj.b(0, 8).fieldOf("radius").forGetter(eip::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eip::d)
            )
            .apply($$0, eip::new)
   );

   public elb a() {
      return this.b;
   }

   public eep b() {
      return this.c;
   }

   public bsj c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
