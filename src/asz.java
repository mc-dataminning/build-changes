import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asz(int d, int e) {
   public static final Codec<Integer> a = atq.a(0, 15);
   public static final Codec<asz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(asz::b), a.fieldOf("sky").forGetter(asz::c)).apply($$0, asz::new)
   );
   public static asz c = new asz(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static asz a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new asz($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
