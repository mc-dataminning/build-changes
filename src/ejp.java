import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejp(int b, int c, int d) implements eis {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("spread_width").forGetter(ejp::a), azn.m.fieldOf("spread_height").forGetter(ejp::b), azn.m.fieldOf("max_height").forGetter(ejp::c)
            )
            .apply($$0, ejp::new)
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
