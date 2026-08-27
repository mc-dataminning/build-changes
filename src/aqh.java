import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqh(int d, int e) {
   public static final Codec<Integer> a = aqw.a(0, 15);
   public static final Codec<aqh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqh::b), a.fieldOf("sky").forGetter(aqh::c)).apply($$0, aqh::new)
   );
   public static aqh c = new aqh(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqh a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqh($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
