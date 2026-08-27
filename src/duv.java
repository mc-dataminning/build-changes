import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duv {
   public static final Codec<duv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkf.c).fieldOf("height").forGetter(duv::a), jy.f.q().fieldOf("block").orElse(cuv.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, duv::new)
   );
   private final cut b;
   private final int c;

   public duv(int $$0, cut $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dgw b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jy.f.b(this.b);
   }
}
