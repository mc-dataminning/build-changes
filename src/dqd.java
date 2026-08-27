import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqd(int b, int c, int d, he<duc> e) implements dpq {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.j.fieldOf("tries").orElse(128).forGetter(dqd::a),
               aqy.i.fieldOf("xz_spread").orElse(7).forGetter(dqd::b),
               aqy.i.fieldOf("y_spread").orElse(3).forGetter(dqd::c),
               duc.b.fieldOf("feature").forGetter(dqd::d)
            )
            .apply($$0, dqd::new)
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

   public he<duc> d() {
      return this.e;
   }
}
