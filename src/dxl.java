import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxl(int b, int c, int d, il<ebk> e) implements dwy {
   public static final Codec<dxl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.j.fieldOf("tries").orElse(128).forGetter(dxl::a),
               avu.i.fieldOf("xz_spread").orElse(7).forGetter(dxl::b),
               avu.i.fieldOf("y_spread").orElse(3).forGetter(dxl::c),
               ebk.b.fieldOf("feature").forGetter(dxl::d)
            )
            .apply($$0, dxl::new)
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

   public il<ebk> d() {
      return this.e;
   }
}
