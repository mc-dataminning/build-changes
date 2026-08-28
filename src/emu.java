import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emu(int b, int c, int d) implements elx {
   public static final Codec<emu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("spread_width").forGetter(emu::a), ayu.m.fieldOf("spread_height").forGetter(emu::b), ayu.m.fieldOf("max_height").forGetter(emu::c)
            )
            .apply($$0, emu::new)
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
