import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elv(int b, int c, int d, je<epx> e) implements eli {
   public static final Codec<elv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter(elv::a),
               ayu.l.fieldOf("xz_spread").orElse(7).forGetter(elv::b),
               ayu.l.fieldOf("y_spread").orElse(3).forGetter(elv::c),
               epx.b.fieldOf("feature").forGetter(elv::d)
            )
            .apply($$0, elv::new)
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

   public je<epx> d() {
      return this.e;
   }
}
