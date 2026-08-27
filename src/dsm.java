import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsm(int b, int c, int d, ib<dwl> e) implements drz {
   public static final Codec<dsm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.j.fieldOf("tries").orElse(128).forGetter(dsm::a),
               asu.i.fieldOf("xz_spread").orElse(7).forGetter(dsm::b),
               asu.i.fieldOf("y_spread").orElse(3).forGetter(dsm::c),
               dwl.b.fieldOf("feature").forGetter(dsm::d)
            )
            .apply($$0, dsm::new)
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

   public ib<dwl> d() {
      return this.e;
   }
}
