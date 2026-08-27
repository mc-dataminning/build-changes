import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record awm(int d, int e) {
   public static final Codec<Integer> a = axe.a(0, 15);
   public static final Codec<awm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(awm::b), a.fieldOf("sky").forGetter(awm::c)).apply($$0, awm::new)
   );
   public static awm c = new awm(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static awm a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new awm($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
