import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egl {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvv.c).fieldOf("height").forGetter(egl::a), lp.e.q().fieldOf("block").orElse(dfc.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egl::new)
   );
   private final dfa b;
   private final int c;

   public egl(int $$0, dfa $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsd b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lp.e.b(this.b);
   }
}
