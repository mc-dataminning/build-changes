import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axt(int d, int e) {
   public static final Codec<Integer> a = aym.a(0, 15);
   public static final Codec<axt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axt::b), a.fieldOf("sky").forGetter(axt::c)).apply($$0, axt::new)
   );
   public static axt c = new axt(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axt a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axt($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
