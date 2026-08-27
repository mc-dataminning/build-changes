import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awa(int d, int e) {
   public static final Codec<Integer> a = aws.a(0, 15);
   public static final Codec<awa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awa::b), a.fieldOf("sky").forGetter(awa::c)).apply($$0, awa::new)
   );
   public static awa c = new awa(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awa a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awa($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
