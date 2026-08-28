import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axk(int d, int e) {
   public static final Codec<Integer> a = ayc.a(0, 15);
   public static final Codec<axk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axk::b), a.fieldOf("sky").forGetter(axk::c)).apply($$0, axk::new)
   );
   public static axk c = new axk(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axk a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axk($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
