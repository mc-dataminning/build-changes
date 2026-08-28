import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awt(int d, int e) {
   public static final Codec<Integer> a = axm.a(0, 15);
   public static final Codec<awt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awt::b), a.fieldOf("sky").forGetter(awt::c)).apply($$0, awt::new)
   );
   public static awt c = new awt(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awt a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awt($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
