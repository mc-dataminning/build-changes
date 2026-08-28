import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epb {
   public static final Codec<epb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eee.c).fieldOf("height").forGetter(epb::a), mf.e.q().fieldOf("block").orElse(dmh.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, epb::new)
   );
   private final dmf b;
   private final int c;

   public epb(int $$0, dmf $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public eah b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mf.e.b(this.b);
   }
}
