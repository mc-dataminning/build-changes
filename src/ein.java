import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ein(int b, int c, int d, jr<emo> e) implements eia {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.m.fieldOf("tries").orElse(128).forGetter(ein::a),
               ayh.l.fieldOf("xz_spread").orElse(7).forGetter(ein::b),
               ayh.l.fieldOf("y_spread").orElse(3).forGetter(ein::c),
               emo.b.fieldOf("feature").forGetter(ein::d)
            )
            .apply($$0, ein::new)
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

   public jr<emo> d() {
      return this.e;
   }
}
