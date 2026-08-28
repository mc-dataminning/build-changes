import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egj {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvt.c).fieldOf("height").forGetter(egj::a), lp.e.q().fieldOf("block").orElse(dfa.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egj::new)
   );
   private final dey b;
   private final int c;

   public egj(int $$0, dey $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsb b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
