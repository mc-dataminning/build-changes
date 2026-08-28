import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egi {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvs.c).fieldOf("height").forGetter(egi::a), lp.e.q().fieldOf("block").orElse(dez.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egi::new)
   );
   private final dex b;
   private final int c;

   public egi(int $$0, dex $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsa b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
