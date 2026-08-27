import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record avm(int d, int e) {
   public static final Codec<Integer> a = awe.a(0, 15);
   public static final Codec<avm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(avm::b), a.fieldOf("sky").forGetter(avm::c)).apply($$0, avm::new)
   );
   public static avm c = new avm(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static avm a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new avm($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
