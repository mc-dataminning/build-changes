import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atg(int d, int e) {
   public static final Codec<Integer> a = atx.a(0, 15);
   public static final Codec<atg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(atg::b), a.fieldOf("sky").forGetter(atg::c)).apply($$0, atg::new)
   );
   public static atg c = new atg(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static atg a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new atg($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
