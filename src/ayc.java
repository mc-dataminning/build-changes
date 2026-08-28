import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayc(int d, int e) {
   public static final Codec<Integer> a = ayv.a(0, 15);
   public static final Codec<ayc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayc::b), a.fieldOf("sky").forGetter(ayc::c)).apply($$0, ayc::new)
   );
   public static ayc c = new ayc(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayc a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayc($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
