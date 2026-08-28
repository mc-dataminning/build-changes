import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daw(jm<avn> d, bpt e, bpt f) implements daq {
   public static final MapCodec<daw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avn.b.fieldOf("sound").forGetter(daw::b),
               bpt.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(daw::c),
               bpt.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(daw::d)
            )
            .apply($$0, daw::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      ayv $$5 = $$3.dT();
      if (!$$3.aX()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.df(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public jm<avn> b() {
      return this.d;
   }

   public bpt c() {
      return this.e;
   }

   public bpt d() {
      return this.f;
   }
}
