import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtd {
   public static final Codec<dtd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, din.c).fieldOf("height").forGetter(dtd::a), jd.f.q().fieldOf("block").orElse(csr.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dtd::new)
   );
   private final csq b;
   private final int c;

   public dtd(int $$0, csq $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dfe b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jd.f.b(this.b);
   }
}
