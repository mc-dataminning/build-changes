import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtb(int b, int c, int d) implements dse {
   public static final Codec<dtb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.j.fieldOf("spread_width").forGetter(dtb::a), asy.j.fieldOf("spread_height").forGetter(dtb::b), asy.j.fieldOf("max_height").forGetter(dtb::c)
            )
            .apply($$0, dtb::new)
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
