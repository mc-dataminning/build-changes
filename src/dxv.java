import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxv(int b, int c, int d) implements dwy {
   public static final Codec<dxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.j.fieldOf("spread_width").forGetter(dxv::a), avu.j.fieldOf("spread_height").forGetter(dxv::b), avu.j.fieldOf("max_height").forGetter(dxv::c)
            )
            .apply($$0, dxv::new)
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
