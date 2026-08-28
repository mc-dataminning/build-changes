import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axz(int d, int e) {
   public static final Codec<Integer> a = ays.a(0, 15);
   public static final Codec<axz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axz::b), a.fieldOf("sky").forGetter(axz::c)).apply($$0, axz::new)
   );
   public static axz c = new axz(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axz a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axz($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
