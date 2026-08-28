import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eot {
   public static final Codec<eot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, edw.c).fieldOf("height").forGetter(eot::a), mf.e.q().fieldOf("block").orElse(dmc.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eot::new)
   );
   private final dma b;
   private final int c;

   public eot(int $$0, dma $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dzz b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mf.e.b(this.b);
   }
}
