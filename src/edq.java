import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edq {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dta.c).fieldOf("height").forGetter(edq::a), kt.e.q().fieldOf("block").orElse(dcj.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, edq::new)
   );
   private final dch b;
   private final int c;

   public edq(int $$0, dch $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dpi b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kt.e.b(this.b);
   }
}
