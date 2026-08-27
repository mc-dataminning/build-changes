import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsw(int b, int c, int d) implements drz {
   public static final Codec<dsw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.j.fieldOf("spread_width").forGetter(dsw::a), asu.j.fieldOf("spread_height").forGetter(dsw::b), asu.j.fieldOf("max_height").forGetter(dsw::c)
            )
            .apply($$0, dsw::new)
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
