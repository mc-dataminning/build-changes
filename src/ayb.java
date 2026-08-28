import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayb(int d, int e) {
   public static final Codec<Integer> a = ayu.a(0, 15);
   public static final Codec<ayb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(ayb::b), a.fieldOf("sky").forGetter(ayb::c)).apply($$0, ayb::new)
   );
   public static ayb c = new ayb(15, 15);

   public int a() {
      return this.d << 4 | this.e << 20;
   }

   public static ayb a(int $$0) {
      int $$1 = $$0 >> 4 & 65535;
      int $$2 = $$0 >> 20 & 65535;
      return new ayb($$1, $$2);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
