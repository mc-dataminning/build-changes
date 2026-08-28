import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehg(int b, int c, int d, jq<elf> e) implements egt {
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.m.fieldOf("tries").orElse(128).forGetter(ehg::a),
               ayw.l.fieldOf("xz_spread").orElse(7).forGetter(ehg::b),
               ayw.l.fieldOf("y_spread").orElse(3).forGetter(ehg::c),
               elf.b.fieldOf("feature").forGetter(ehg::d)
            )
            .apply($$0, ehg::new)
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

   public jq<elf> d() {
      return this.e;
   }
}
