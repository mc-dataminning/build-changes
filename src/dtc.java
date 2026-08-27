import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc {
   public static final Codec<dtc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dim.c).fieldOf("height").forGetter(dtc::a), jb.f.q().fieldOf("block").orElse(cte.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dtc::new)
   );
   private final ctc b;
   private final int c;

   public dtc(int $$0, ctc $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dfd b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jb.f.b(this.b);
   }
}
