import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnp(int b, int c, int d) implements dms {
   public static final Codec<dnp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoi.j.fieldOf("spread_width").forGetter(dnp::a), aoi.j.fieldOf("spread_height").forGetter(dnp::b), aoi.j.fieldOf("max_height").forGetter(dnp::c)
            )
            .apply($$0, dnp::new)
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
