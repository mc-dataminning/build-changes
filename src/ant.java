import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ant(int d, int e) {
   public static final Codec<Integer> a = aoi.a(0, 15);
   public static final Codec<ant> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ant::b), a.fieldOf("sky").forGetter(ant::c)).apply($$0, ant::new)
   );
   public static ant c = new ant(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ant a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ant($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
