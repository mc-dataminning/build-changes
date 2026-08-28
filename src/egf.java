import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egf {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvp.c).fieldOf("height").forGetter(egf::a), lp.e.q().fieldOf("block").orElse(dew.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egf::new)
   );
   private final deu b;
   private final int c;

   public egf(int $$0, deu $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public drx b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
