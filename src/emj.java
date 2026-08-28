import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emj {
   public static final Codec<emj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebp.c).fieldOf("height").forGetter(emj::a), ma.e.q().fieldOf("block").orElse(dkn.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, emj::new)
   );
   private final dkl b;
   private final int c;

   public emj(int $$0, dkl $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dxu b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ma.e.b(this.b);
   }
}
