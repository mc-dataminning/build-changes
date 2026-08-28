import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axd(int d, int e) {
   public static final Codec<Integer> a = axw.a(0, 15);
   public static final Codec<axd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axd::b), a.fieldOf("sky").forGetter(axd::c)).apply($$0, axd::new)
   );
   public static axd c = new axd(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axd a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axd($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
