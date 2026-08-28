import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayu(int d, int e) {
   public static final Codec<Integer> a = azn.a(0, 15);
   public static final Codec<ayu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayu::b), a.fieldOf("sky").forGetter(ayu::c)).apply($$0, ayu::new)
   );
   public static ayu c = new ayu(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayu a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayu($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
