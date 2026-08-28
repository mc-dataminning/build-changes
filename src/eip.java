import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eip(int b, int c, int d, jr<emq> e) implements eic {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("tries").orElse(128).forGetter(eip::a),
               ayi.l.fieldOf("xz_spread").orElse(7).forGetter(eip::b),
               ayi.l.fieldOf("y_spread").orElse(3).forGetter(eip::c),
               emq.b.fieldOf("feature").forGetter(eip::d)
            )
            .apply($$0, eip::new)
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

   public jr<emq> d() {
      return this.e;
   }
}
