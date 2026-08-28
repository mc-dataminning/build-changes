import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayn(int d, int e) {
   public static final Codec<Integer> a = azg.a(0, 15);
   public static final Codec<ayn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayn::b), a.fieldOf("sky").forGetter(ayn::c)).apply($$0, ayn::new)
   );
   public static final ayn c = new ayn(15, 15);

   public static int a(int $$0, int $$1) {
      return $$0 << 4 | $$1 << 20;
   }

   public int a() {
      return a(this.d, this.e);
   }

   public static int a(int $$0) {
      return $$0 >> 4 & 65535;
   }

   public static int b(int $$0) {
      return $$0 >> 20 & 65535;
   }

   public static ayn c(int $$0) {
      return new ayn(a($$0), b($$0));
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
