import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awv(int d, int e) {
   public static final Codec<Integer> a = axn.a(0, 15);
   public static final Codec<awv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awv::b), a.fieldOf("sky").forGetter(awv::c)).apply($$0, awv::new)
   );
   public static awv c = new awv(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awv a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awv($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
