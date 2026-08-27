import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk {
   public static final Codec<dtk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, diu.c).fieldOf("height").forGetter(dtk::a), jd.f.q().fieldOf("block").orElse(csy.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dtk::new)
   );
   private final csx b;
   private final int c;

   public dtk(int $$0, csx $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dfl b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jd.f.b(this.b);
   }
}
