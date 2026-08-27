import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqq(int d, int e) {
   public static final Codec<Integer> a = arf.a(0, 15);
   public static final Codec<aqq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqq::b), a.fieldOf("sky").forGetter(aqq::c)).apply($$0, aqq::new)
   );
   public static aqq c = new aqq(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqq a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqq($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
