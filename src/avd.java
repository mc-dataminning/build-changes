import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record avd(int d, int e) {
   public static final Codec<Integer> a = avu.a(0, 15);
   public static final Codec<avd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(avd::b), a.fieldOf("sky").forGetter(avd::c)).apply($$0, avd::new)
   );
   public static avd c = new avd(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static avd a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new avd($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
