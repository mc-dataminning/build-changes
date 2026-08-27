import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record arq(int d, int e) {
   public static final Codec<Integer> a = asg.a(0, 15);
   public static final Codec<arq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(arq::b), a.fieldOf("sky").forGetter(arq::c)).apply($$0, arq::new)
   );
   public static arq c = new arq(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static arq a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new arq($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
