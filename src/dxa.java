import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxa(int b, int c, int d) implements dwd {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.j.fieldOf("spread_width").forGetter(dxa::a), avq.j.fieldOf("spread_height").forGetter(dxa::b), avq.j.fieldOf("max_height").forGetter(dxa::c)
            )
            .apply($$0, dxa::new)
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
