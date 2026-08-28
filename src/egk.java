import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egk {
   public static final Codec<egk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvu.c).fieldOf("height").forGetter(egk::a), lp.e.q().fieldOf("block").orElse(dfb.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egk::new)
   );
   private final dez b;
   private final int c;

   public egk(int $$0, dez $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsc b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
