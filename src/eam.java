import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eam(int b, int c, int d, il<eel> e) implements dzz {
   public static final Codec<eam> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.j.fieldOf("tries").orElse(128).forGetter(eam::a),
               aws.i.fieldOf("xz_spread").orElse(7).forGetter(eam::b),
               aws.i.fieldOf("y_spread").orElse(3).forGetter(eam::c),
               eel.b.fieldOf("feature").forGetter(eam::d)
            )
            .apply($$0, eam::new)
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

   public il<eel> d() {
      return this.e;
   }
}
