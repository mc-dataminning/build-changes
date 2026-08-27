import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asp(int d, int e) {
   public static final Codec<Integer> a = atg.a(0, 15);
   public static final Codec<asp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(asp::b), a.fieldOf("sky").forGetter(asp::c)).apply($$0, asp::new)
   );
   public static asp c = new asp(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static asp a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new asp($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
