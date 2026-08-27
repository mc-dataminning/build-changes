import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ase(int d, int e) {
   public static final Codec<Integer> a = asu.a(0, 15);
   public static final Codec<ase> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ase::b), a.fieldOf("sky").forGetter(ase::c)).apply($$0, ase::new)
   );
   public static ase c = new ase(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ase a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ase($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
