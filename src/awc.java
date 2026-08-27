import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awc(int d, int e) {
   public static final Codec<Integer> a = awu.a(0, 15);
   public static final Codec<awc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awc::b), a.fieldOf("sky").forGetter(awc::c)).apply($$0, awc::new)
   );
   public static awc c = new awc(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awc a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awc($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
