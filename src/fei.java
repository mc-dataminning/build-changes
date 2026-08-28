import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fei(float b, dhe c, jg<dgx> g) implements fec {
   public static final MapCodec<fei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fei::c),
               dhe.b.fieldOf("enchanted_chance").forGetter(fei::d),
               dgx.c.fieldOf("enchantment").forGetter(fei::e)
            )
            .apply($$0, fei::new)
   );

   @Override
   public fed b() {
      return fee.e;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.d);
   }

   public boolean a(fat $$0) {
      bxe $$1 = $$0.c(fdn.d);
      int $$3 = $$1 instanceof byf $$2 ? dgz.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fec.a a(ji.a $$0, float $$1, float $$2) {
      ji.b<dgx> $$3 = $$0.e(mi.aR);
      return () -> new fei($$1, new dhe.e($$1 + $$2, $$2), $$3.b(dhc.s));
   }

   public float c() {
      return this.b;
   }

   public dhe d() {
      return this.c;
   }

   public jg<dgx> e() {
      return this.g;
   }
}
