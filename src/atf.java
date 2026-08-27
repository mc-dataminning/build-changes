import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atf(int d, int e) {
   public static final Codec<Integer> a = atw.a(0, 15);
   public static final Codec<atf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(atf::b), a.fieldOf("sky").forGetter(atf::c)).apply($$0, atf::new)
   );
   public static atf c = new atf(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static atf a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new atf($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
