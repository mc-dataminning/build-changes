import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aya(int d, int e) {
   public static final Codec<Integer> a = ayt.a(0, 15);
   public static final Codec<aya> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aya::b), a.fieldOf("sky").forGetter(aya::c)).apply($$0, aya::new)
   );
   public static aya c = new aya(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aya a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aya($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
