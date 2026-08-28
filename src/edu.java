import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edu(int b, int c, int d) implements ecx {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.l.fieldOf("spread_width").forGetter(edu::a), ayc.l.fieldOf("spread_height").forGetter(edu::b), ayc.l.fieldOf("max_height").forGetter(edu::c)
            )
            .apply($$0, edu::new)
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
