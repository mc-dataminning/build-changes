import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awu(int d, int e) {
   public static final Codec<Integer> a = axm.a(0, 15);
   public static final Codec<awu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awu::b), a.fieldOf("sky").forGetter(awu::c)).apply($$0, awu::new)
   );
   public static awu c = new awu(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awu a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awu($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
