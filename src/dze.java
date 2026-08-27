import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dze {
   public static final Codec<dze> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, doo.c).fieldOf("height").forGetter(dze::a), kf.e.q().fieldOf("block").orElse(cyq.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dze::new)
   );
   private final cyo b;
   private final int c;

   public dze(int $$0, cyo $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dlf b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kf.e.b(this.b);
   }
}
