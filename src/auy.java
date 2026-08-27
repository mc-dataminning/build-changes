import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record auy(int d, int e) {
   public static final Codec<Integer> a = avp.a(0, 15);
   public static final Codec<auy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(auy::b), a.fieldOf("sky").forGetter(auy::c)).apply($$0, auy::new)
   );
   public static auy c = new auy(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static auy a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new auy($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
