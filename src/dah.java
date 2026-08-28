import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dah(jj<avg> d, bpj e, bpj f) implements dab {
   public static final MapCodec<dah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avg.b.fieldOf("sound").forGetter(dah::b),
               bpj.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dah::c),
               bpj.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dah::d)
            )
            .apply($$0, dah::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ayo $$5 = $$3.dT();
      if (!$$3.aX()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.df(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public jj<avg> b() {
      return this.d;
   }

   public bpj c() {
      return this.e;
   }

   public bpj d() {
      return this.f;
   }
}
