import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egw(int b, int c, int d, jp<ekv> e) implements egj {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("tries").orElse(128).forGetter(egw::a),
               ays.l.fieldOf("xz_spread").orElse(7).forGetter(egw::b),
               ays.l.fieldOf("y_spread").orElse(3).forGetter(egw::c),
               ekv.b.fieldOf("feature").forGetter(egw::d)
            )
            .apply($$0, egw::new)
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

   public jp<ekv> d() {
      return this.e;
   }
}
