import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqt(int d, int e) {
   public static final Codec<Integer> a = arj.a(0, 15);
   public static final Codec<aqt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(aqt::b), a.fieldOf("sky").forGetter(aqt::c)).apply($$0, aqt::new)
   );
   public static aqt c = new aqt(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static aqt a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new aqt($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
