import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayn(int d, int e) {
   public static final Codec<Integer> a = azg.a(0, 15);
   public static final Codec<ayn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayn::b), a.fieldOf("sky").forGetter(ayn::c)).apply($$0, ayn::new)
   );
   public static ayn c = new ayn(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayn a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayn($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
