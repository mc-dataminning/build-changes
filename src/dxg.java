import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxg {
   public static final Codec<dxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmq.c).fieldOf("height").forGetter(dxg::a), kd.e.q().fieldOf("block").orElse(cws.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dxg::new)
   );
   private final cwq b;
   private final int c;

   public dxg(int $$0, cwq $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public djh b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kd.e.b(this.b);
   }
}
