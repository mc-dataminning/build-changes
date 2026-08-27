import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drf(int b, int c, int d, ib<dve> e) implements dqs {
   public static final Codec<drf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.j.fieldOf("tries").orElse(128).forGetter(drf::a),
               asg.i.fieldOf("xz_spread").orElse(7).forGetter(drf::b),
               asg.i.fieldOf("y_spread").orElse(3).forGetter(drf::c),
               dve.b.fieldOf("feature").forGetter(drf::d)
            )
            .apply($$0, drf::new)
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

   public ib<dve> d() {
      return this.e;
   }
}
