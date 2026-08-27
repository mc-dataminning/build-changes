import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwt(int b, int c, int d) implements dvw {
   public static final Codec<dwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.j.fieldOf("spread_width").forGetter(dwt::a), avp.j.fieldOf("spread_height").forGetter(dwt::b), avp.j.fieldOf("max_height").forGetter(dwt::c)
            )
            .apply($$0, dwt::new)
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
