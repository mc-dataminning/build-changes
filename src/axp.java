import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axp(int d, int e) {
   public static final Codec<Integer> a = ayi.a(0, 15);
   public static final Codec<axp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axp::b), a.fieldOf("sky").forGetter(axp::c)).apply($$0, axp::new)
   );
   public static axp c = new axp(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axp a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axp($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
