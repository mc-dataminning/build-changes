import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvh {
   public static final Codec<dvh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkr.c).fieldOf("height").forGetter(dvh::a), jy.f.q().fieldOf("block").orElse(cvc.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dvh::new)
   );
   private final cva b;
   private final int c;

   public dvh(int $$0, cva $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dhi b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jy.f.b(this.b);
   }
}
