import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebc {
   public static final Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dqm.c).fieldOf("height").forGetter(ebc::a), ki.e.q().fieldOf("block").orElse(dac.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ebc::new)
   );
   private final daa b;
   private final int c;

   public ebc(int $$0, daa $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dmz b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ki.e.b(this.b);
   }
}
