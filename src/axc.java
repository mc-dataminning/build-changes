import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axc(int d, int e) {
   public static final Codec<Integer> a = axv.a(0, 15);
   public static final Codec<axc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axc::b), a.fieldOf("sky").forGetter(axc::c)).apply($$0, axc::new)
   );
   public static axc c = new axc(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axc a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axc($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
