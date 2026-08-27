import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqj(int d, int e) {
   public static final Codec<Integer> a = aqy.a(0, 15);
   public static final Codec<aqj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqj::b), a.fieldOf("sky").forGetter(aqj::c)).apply($$0, aqj::new)
   );
   public static aqj c = new aqj(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqj a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqj($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
