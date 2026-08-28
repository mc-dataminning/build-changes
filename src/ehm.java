import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehm {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwv.c).fieldOf("height").forGetter(ehm::a), lt.e.r().fieldOf("block").orElse(dfy.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ehm::new)
   );
   private final dfw b;
   private final int c;

   public ehm(int $$0, dfw $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dta b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lt.e.b(this.b);
   }
}
