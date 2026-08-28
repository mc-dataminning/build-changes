import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejw(int b, int c, int d) implements eiz {
   public static final Codec<ejw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("spread_width").forGetter(ejw::a), azn.m.fieldOf("spread_height").forGetter(ejw::b), azn.m.fieldOf("max_height").forGetter(ejw::c)
            )
            .apply($$0, ejw::new)
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
