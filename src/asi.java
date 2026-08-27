import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asi(int d, int e) {
   public static final Codec<Integer> a = asy.a(0, 15);
   public static final Codec<asi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(asi::b), a.fieldOf("sky").forGetter(asi::c)).apply($$0, asi::new)
   );
   public static asi c = new asi(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static asi a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new asi($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
