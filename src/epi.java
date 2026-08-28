import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epi {
   public static final Codec<epi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eel.c).fieldOf("height").forGetter(epi::a), mg.e.q().fieldOf("block").orElse(dmo.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, epi::new)
   );
   private final dmm b;
   private final int c;

   public epi(int $$0, dmm $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public eao b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mg.e.b(this.b);
   }
}
