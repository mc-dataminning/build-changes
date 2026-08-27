import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqm(int d, int e) {
   public static final Codec<Integer> a = arb.a(0, 15);
   public static final Codec<aqm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqm::b), a.fieldOf("sky").forGetter(aqm::c)).apply($$0, aqm::new)
   );
   public static aqm c = new aqm(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqm a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqm($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
