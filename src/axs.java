import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record axs(int d, int e) {
   public static final Codec<Integer> a = ayl.a(0, 15);
   public static final Codec<axs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(axs::b), a.fieldOf("sky").forGetter(axs::c)).apply($$0, axs::new)
   );
   public static axs c = new axs(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static axs a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new axs($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
