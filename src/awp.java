import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awp(int d, int e) {
   public static final Codec<Integer> a = axh.a(0, 15);
   public static final Codec<awp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awp::b), a.fieldOf("sky").forGetter(awp::c)).apply($$0, awp::new)
   );
   public static awp c = new awp(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awp a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awp($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
