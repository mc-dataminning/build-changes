import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiq(elc b, eeq c, bsf d, int e) implements eit {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elc.a.fieldOf("state_provider").forGetter(eiq::a),
               eeq.b.fieldOf("target").forGetter(eiq::b),
               bsf.b(0, 8).fieldOf("radius").forGetter(eiq::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eiq::d)
            )
            .apply($$0, eiq::new)
   );

   public elc a() {
      return this.b;
   }

   public eeq b() {
      return this.c;
   }

   public bsf c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
