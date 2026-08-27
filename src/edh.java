import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dsr.c).fieldOf("height").forGetter(edh::a), kr.e.q().fieldOf("block").orElse(dca.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, edh::new)
   );
   private final dby b;
   private final int c;

   public edh(int $$0, dby $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public doz b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kr.e.b(this.b);
   }
}
