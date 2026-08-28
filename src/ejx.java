import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejx {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzf.c).fieldOf("height").forGetter(ejx::a), ly.e.q().fieldOf("block").orElse(dig.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ejx::new)
   );
   private final die b;
   private final int c;

   public ejx(int $$0, die $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dvj b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ly.e.b(this.b);
   }
}
