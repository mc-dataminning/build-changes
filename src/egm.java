import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egm {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvw.c).fieldOf("height").forGetter(egm::a), lp.e.q().fieldOf("block").orElse(dfd.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egm::new)
   );
   private final dfb b;
   private final int c;

   public egm(int $$0, dfb $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dse b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
