import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehp {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwy.c).fieldOf("height").forGetter(ehp::a), lt.e.r().fieldOf("block").orElse(dga.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ehp::new)
   );
   private final dfy b;
   private final int c;

   public ehp(int $$0, dfy $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dtc b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lt.e.b(this.b);
   }
}
