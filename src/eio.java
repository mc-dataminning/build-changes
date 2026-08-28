import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eio(int b, int c, int d, jr<emp> e) implements eib {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("tries").orElse(128).forGetter(eio::a),
               ayi.l.fieldOf("xz_spread").orElse(7).forGetter(eio::b),
               ayi.l.fieldOf("y_spread").orElse(3).forGetter(eio::c),
               emp.b.fieldOf("feature").forGetter(eio::d)
            )
            .apply($$0, eio::new)
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

   public jr<emp> d() {
      return this.e;
   }
}
