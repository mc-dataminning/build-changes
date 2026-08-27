import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwj(int b, int c, int d, ij<eai> e) implements dvw {
   public static final Codec<dwj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.j.fieldOf("tries").orElse(128).forGetter(dwj::a),
               avp.i.fieldOf("xz_spread").orElse(7).forGetter(dwj::b),
               avp.i.fieldOf("y_spread").orElse(3).forGetter(dwj::c),
               eai.b.fieldOf("feature").forGetter(dwj::d)
            )
            .apply($$0, dwj::new)
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

   public ij<eai> d() {
      return this.e;
   }
}
