import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqb {
   public static final Codec<eqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efb.c).fieldOf("height").forGetter(eqb::a), mg.e.q().fieldOf("block").orElse(dne.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eqb::new)
   );
   private final dnc b;
   private final int c;

   public eqb(int $$0, dnc $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public ebe b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mg.e.b(this.b);
   }
}
