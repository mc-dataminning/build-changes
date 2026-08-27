import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebf(int b, int c, int d) implements eai {
   public static final Codec<ebf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.j.fieldOf("spread_width").forGetter(ebf::a), awu.j.fieldOf("spread_height").forGetter(ebf::b), awu.j.fieldOf("max_height").forGetter(ebf::c)
            )
            .apply($$0, ebf::new)
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
