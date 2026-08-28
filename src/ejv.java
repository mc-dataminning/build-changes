import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejv(int b, int c, int d) implements eiy {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("spread_width").forGetter(ejv::a), ayi.m.fieldOf("spread_height").forGetter(ejv::b), ayi.m.fieldOf("max_height").forGetter(ejv::c)
            )
            .apply($$0, ejv::new)
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
