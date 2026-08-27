import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebu(int b, int c, int d, iw<eft> e) implements ebh {
   public static final Codec<ebu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.j.fieldOf("tries").orElse(128).forGetter(ebu::a),
               axh.i.fieldOf("xz_spread").orElse(7).forGetter(ebu::b),
               axh.i.fieldOf("y_spread").orElse(3).forGetter(ebu::c),
               eft.b.fieldOf("feature").forGetter(ebu::d)
            )
            .apply($$0, ebu::new)
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

   public iw<eft> d() {
      return this.e;
   }
}
