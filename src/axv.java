import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axv(int d, int e) {
   public static final Codec<Integer> a = ayo.a(0, 15);
   public static final Codec<axv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axv::b), a.fieldOf("sky").forGetter(axv::c)).apply($$0, axv::new)
   );
   public static axv c = new axv(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axv a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axv($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
