import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehx(int b, int c, int d) implements eha {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.m.fieldOf("spread_width").forGetter(ehx::a), ayv.m.fieldOf("spread_height").forGetter(ehx::b), ayv.m.fieldOf("max_height").forGetter(ehx::c)
            )
            .apply($$0, ehx::new)
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
