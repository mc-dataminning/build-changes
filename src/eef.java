import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eef(int b, int c, int d) implements edi {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.l.fieldOf("spread_width").forGetter(eef::a), axm.l.fieldOf("spread_height").forGetter(eef::b), axm.l.fieldOf("max_height").forGetter(eef::c)
            )
            .apply($$0, eef::new)
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
