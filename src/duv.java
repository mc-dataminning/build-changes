import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duv(int b, int c, int d) implements dty {
   public static final Codec<duv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.j.fieldOf("spread_width").forGetter(duv::a), atw.j.fieldOf("spread_height").forGetter(duv::b), atw.j.fieldOf("max_height").forGetter(duv::c)
            )
            .apply($$0, duv::new)
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
