import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emc {
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebi.c).fieldOf("height").forGetter(emc::a), ma.e.q().fieldOf("block").orElse(dkg.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, emc::new)
   );
   private final dke b;
   private final int c;

   public emc(int $$0, dke $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dxn b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ma.e.b(this.b);
   }
}
