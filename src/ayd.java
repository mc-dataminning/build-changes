import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayd(int d, int e) {
   public static final Codec<Integer> a = ayw.a(0, 15);
   public static final Codec<ayd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayd::b), a.fieldOf("sky").forGetter(ayd::c)).apply($$0, ayd::new)
   );
   public static ayd c = new ayd(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayd a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayd($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
