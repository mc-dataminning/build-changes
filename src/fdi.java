import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdi(float b, dgh c, jf<dga> g) implements fdc {
   public static final MapCodec<fdi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fdi::c),
               dgh.b.fieldOf("enchanted_chance").forGetter(fdi::d),
               dga.c.fieldOf("enchantment").forGetter(fdi::e)
            )
            .apply($$0, fdi::new)
   );

   @Override
   public fdd b() {
      return fde.e;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.d);
   }

   public boolean a(ezt $$0) {
      bwi $$1 = $$0.c(fcn.d);
      int $$3 = $$1 instanceof bxj $$2 ? dgc.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fdc.a a(jh.a $$0, float $$1, float $$2) {
      jh.b<dga> $$3 = $$0.e(mh.aR);
      return () -> new fdi($$1, new dgh.e($$1 + $$2, $$2), $$3.b(dgf.s));
   }

   public float c() {
      return this.b;
   }

   public dgh d() {
      return this.c;
   }

   public jf<dga> e() {
      return this.g;
   }
}
