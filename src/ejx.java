import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejx(int b, int c, int d) implements eja {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("spread_width").forGetter(ejx::a), azn.m.fieldOf("spread_height").forGetter(ejx::b), azn.m.fieldOf("max_height").forGetter(ejx::c)
            )
            .apply($$0, ejx::new)
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
