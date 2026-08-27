import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnf(int b, int c, int d, he<dre> e) implements dms {
   public static final Codec<dnf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoi.j.fieldOf("tries").orElse(128).forGetter(dnf::a),
               aoi.i.fieldOf("xz_spread").orElse(7).forGetter(dnf::b),
               aoi.i.fieldOf("y_spread").orElse(3).forGetter(dnf::c),
               dre.b.fieldOf("feature").forGetter(dnf::d)
            )
            .apply($$0, dnf::new)
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

   public he<dre> d() {
      return this.e;
   }
}
