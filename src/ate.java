import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ate(int d, int e) {
   public static final Codec<Integer> a = atv.a(0, 15);
   public static final Codec<ate> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ate::b), a.fieldOf("sky").forGetter(ate::c)).apply($$0, ate::new)
   );
   public static ate c = new ate(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ate a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ate($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
