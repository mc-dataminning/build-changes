import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejl(int b, int c, int d, jr<enn> e) implements eiy {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("tries").orElse(128).forGetter(ejl::a),
               ayi.l.fieldOf("xz_spread").orElse(7).forGetter(ejl::b),
               ayi.l.fieldOf("y_spread").orElse(3).forGetter(ejl::c),
               enn.b.fieldOf("feature").forGetter(ejl::d)
            )
            .apply($$0, ejl::new)
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

   public jr<enn> d() {
      return this.e;
   }
}
