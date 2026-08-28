import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egq {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvz.c).fieldOf("height").forGetter(egq::a), lq.e.r().fieldOf("block").orElse(dfh.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egq::new)
   );
   private final dff b;
   private final int c;

   public egq(int $$0, dff $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsh b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lq.e.b(this.b);
   }
}
