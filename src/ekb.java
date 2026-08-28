import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekb {
   public static final Codec<ekb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzj.c).fieldOf("height").forGetter(ekb::a), lz.e.q().fieldOf("block").orElse(dil.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ekb::new)
   );
   private final dij b;
   private final int c;

   public ekb(int $$0, dij $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dvo b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lz.e.b(this.b);
   }
}
