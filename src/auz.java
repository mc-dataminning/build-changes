import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record auz(int d, int e) {
   public static final Codec<Integer> a = avq.a(0, 15);
   public static final Codec<auz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(auz::b), a.fieldOf("sky").forGetter(auz::c)).apply($$0, auz::new)
   );
   public static auz c = new auz(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static auz a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new auz($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
