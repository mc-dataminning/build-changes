import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efb(int b, int c, int d) implements eee {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.l.fieldOf("spread_width").forGetter(efb::a), axv.l.fieldOf("spread_height").forGetter(efb::b), axv.l.fieldOf("max_height").forGetter(efb::c)
            )
            .apply($$0, efb::new)
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
