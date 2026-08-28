import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhi(jf<awo> d, btu e, btu f) implements dhc {
   public static final MapCodec<dhi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awo.b.fieldOf("sound").forGetter(dhi::b),
               btu.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dhi::c),
               btu.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dhi::d)
            )
            .apply($$0, dhi::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      azx $$5 = $$3.dY();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public jf<awo> b() {
      return this.d;
   }

   public btu c() {
      return this.e;
   }

   public btu d() {
      return this.f;
   }
}
