import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asa(int d, int e) {
   public static final Codec<Integer> a = asq.a(0, 15);
   public static final Codec<asa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(asa::b), a.fieldOf("sky").forGetter(asa::c)).apply($$0, asa::new)
   );
   public static asa c = new asa(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static asa a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new asa($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
