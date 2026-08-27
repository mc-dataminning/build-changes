import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqr(int d, int e) {
   public static final Codec<Integer> a = arg.a(0, 15);
   public static final Codec<aqr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqr::b), a.fieldOf("sky").forGetter(aqr::c)).apply($$0, aqr::new)
   );
   public static aqr c = new aqr(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqr a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqr($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
