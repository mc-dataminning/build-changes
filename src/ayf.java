import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayf(int d, int e) {
   public static final Codec<Integer> a = ayy.a(0, 15);
   public static final Codec<ayf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayf::b), a.fieldOf("sky").forGetter(ayf::c)).apply($$0, ayf::new)
   );
   public static ayf c = new ayf(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayf a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayf($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
