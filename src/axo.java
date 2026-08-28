import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axo(int d, int e) {
   public static final Codec<Integer> a = ayh.a(0, 15);
   public static final Codec<axo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axo::b), a.fieldOf("sky").forGetter(axo::c)).apply($$0, axo::new)
   );
   public static axo c = new axo(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axo a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axo($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
