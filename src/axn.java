import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axn(int d, int e) {
   public static final Codec<Integer> a = ayg.a(0, 15);
   public static final Codec<axn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axn::b), a.fieldOf("sky").forGetter(axn::c)).apply($$0, axn::new)
   );
   public static axn c = new axn(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axn a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axn($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
