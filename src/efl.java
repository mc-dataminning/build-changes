import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efl {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, duv.c).fieldOf("height").forGetter(efl::a), le.e.q().fieldOf("block").orElse(dec.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, efl::new)
   );
   private final dea b;
   private final int c;

   public efl(int $$0, dea $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public drd b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + le.e.b(this.b);
   }
}
