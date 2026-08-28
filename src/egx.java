import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egx {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwg.c).fieldOf("height").forGetter(egx::a), lq.e.r().fieldOf("block").orElse(dfk.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egx::new)
   );
   private final dfi b;
   private final int c;

   public egx(int $$0, dfi $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsl b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lq.e.b(this.b);
   }
}
