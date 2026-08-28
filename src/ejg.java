import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejg {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyo.c).fieldOf("height").forGetter(ejg::a), lv.e.q().fieldOf("block").orElse(dho.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ejg::new)
   );
   private final dhm b;
   private final int c;

   public ejg(int $$0, dhm $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dus b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lv.e.b(this.b);
   }
}
