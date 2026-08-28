import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eng {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ecj.c).fieldOf("height").forGetter(eng::a), md.e.q().fieldOf("block").orElse(dkw.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eng::new)
   );
   private final dku b;
   private final int c;

   public eng(int $$0, dku $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dym b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + md.e.b(this.b);
   }
}
