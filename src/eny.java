import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eny(int b, int c, int d) implements enb {
   public static final Codec<eny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.m.fieldOf("spread_width").forGetter(eny::a), azg.m.fieldOf("spread_height").forGetter(eny::b), azg.m.fieldOf("max_height").forGetter(eny::c)
            )
            .apply($$0, eny::new)
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
