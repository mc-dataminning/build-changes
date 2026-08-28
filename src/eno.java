import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eno(int b, int c, int d) implements emr {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.m.fieldOf("spread_width").forGetter(eno::a), ayy.m.fieldOf("spread_height").forGetter(eno::b), ayy.m.fieldOf("max_height").forGetter(eno::c)
            )
            .apply($$0, eno::new)
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
