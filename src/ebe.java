import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebe {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dqo.c).fieldOf("height").forGetter(ebe::a), ki.e.q().fieldOf("block").orElse(dae.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ebe::new)
   );
   private final dac b;
   private final int c;

   public ebe(int $$0, dac $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dnb b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ki.e.b(this.b);
   }
}
