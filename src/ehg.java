import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehg(int b, int c, int d) implements egj {
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("spread_width").forGetter(ehg::a), ays.m.fieldOf("spread_height").forGetter(ehg::b), ays.m.fieldOf("max_height").forGetter(ehg::c)
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
}
