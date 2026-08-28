import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejn(int b, int c, int d, jq<eno> e) implements eja {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("tries").orElse(128).forGetter(ejn::a),
               azn.l.fieldOf("xz_spread").orElse(7).forGetter(ejn::b),
               azn.l.fieldOf("y_spread").orElse(3).forGetter(ejn::c),
               eno.b.fieldOf("feature").forGetter(ejn::d)
            )
            .apply($$0, ejn::new)
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

   public jq<eno> d() {
      return this.e;
   }
}
