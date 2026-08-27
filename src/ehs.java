import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehs {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwu.c).fieldOf("height").forGetter(ehs::a), lh.e.q().fieldOf("block").orElse(dfe.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ehs::new)
   );
   private final dfc b;
   private final int c;

   public ehs(int $$0, dfc $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dtc b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lh.e.b(this.b);
   }
}
