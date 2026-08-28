import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eel(int b, int c, int d) implements edo {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.l.fieldOf("spread_width").forGetter(eel::a), axo.l.fieldOf("spread_height").forGetter(eel::b), axo.l.fieldOf("max_height").forGetter(eel::c)
            )
            .apply($$0, eel::new)
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
