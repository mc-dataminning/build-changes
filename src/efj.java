import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efj {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dut.c).fieldOf("height").forGetter(efj::a), le.e.q().fieldOf("block").orElse(dea.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, efj::new)
   );
   private final ddy b;
   private final int c;

   public efj(int $$0, ddy $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public drb b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + le.e.b(this.b);
   }
}
