import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayk(int d, int e) {
   public static final Codec<Integer> a = azd.a(0, 15);
   public static final Codec<ayk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayk::b), a.fieldOf("sky").forGetter(ayk::c)).apply($$0, ayk::new)
   );
   public static ayk c = new ayk(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayk a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayk($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
