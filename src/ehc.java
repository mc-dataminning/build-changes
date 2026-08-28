import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehc(int b, int c, int d, jq<elb> e) implements egp {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.m.fieldOf("tries").orElse(128).forGetter(ehc::a),
               ayt.l.fieldOf("xz_spread").orElse(7).forGetter(ehc::b),
               ayt.l.fieldOf("y_spread").orElse(3).forGetter(ehc::c),
               elb.b.fieldOf("feature").forGetter(ehc::d)
            )
            .apply($$0, ehc::new)
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

   public jq<elb> d() {
      return this.e;
   }
}
