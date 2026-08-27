import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag {
   public static final Codec<eag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dpq.c).fieldOf("height").forGetter(eag::a), kh.e.q().fieldOf("block").orElse(czh.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eag::new)
   );
   private final czf b;
   private final int c;

   public eag(int $$0, czf $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dme b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kh.e.b(this.b);
   }
}
