import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edk(int b, int c, int d, ji<ehj> e) implements ecx {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.l.fieldOf("tries").orElse(128).forGetter(edk::a),
               ayc.k.fieldOf("xz_spread").orElse(7).forGetter(edk::b),
               ayc.k.fieldOf("y_spread").orElse(3).forGetter(edk::c),
               ehj.b.fieldOf("feature").forGetter(edk::d)
            )
            .apply($$0, edk::new)
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

   public ji<ehj> d() {
      return this.e;
   }
}
