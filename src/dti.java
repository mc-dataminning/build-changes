import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti {
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dis.c).fieldOf("height").forGetter(dti::a), jd.f.q().fieldOf("block").orElse(csw.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dti::new)
   );
   private final csv b;
   private final int c;

   public dti(int $$0, csv $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dfj b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jd.f.b(this.b);
   }
}
