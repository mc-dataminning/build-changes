import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiq(int b, int c, int d, jr<emr> e) implements eid {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("tries").orElse(128).forGetter(eiq::a),
               ayi.l.fieldOf("xz_spread").orElse(7).forGetter(eiq::b),
               ayi.l.fieldOf("y_spread").orElse(3).forGetter(eiq::c),
               emr.b.fieldOf("feature").forGetter(eiq::d)
            )
            .apply($$0, eiq::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public jr<emr> d() {
      return this.e;
   }
}
