import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqs(int d, int e) {
   public static final Codec<Integer> a = arh.a(0, 15);
   public static final Codec<aqs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqs::b), a.fieldOf("sky").forGetter(aqs::c)).apply($$0, aqs::new)
   );
   public static aqs c = new aqs(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqs a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqs($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
