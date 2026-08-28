import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eml(eoy b, eik c, btw d, int e) implements emp {
   public static final Codec<eml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoy.a.fieldOf("state_provider").forGetter(eml::a),
               eik.b.fieldOf("target").forGetter(eml::b),
               btw.b(0, 8).fieldOf("radius").forGetter(eml::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eml::d)
            )
            .apply($$0, eml::new)
   );

   public eoy a() {
      return this.b;
   }

   public eik b() {
      return this.c;
   }

   public btw c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
