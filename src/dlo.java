import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlo extends dis implements dim {
   public static final MapCodec<dlo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a(ma.aJ).fieldOf("feature").forGetter($$0x -> $$0x.e), lz.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dlo::new)
   );
   protected static final fal b = dij.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dij d;
   private final alk<eeb<?, ?>> e;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(alk<eeb<?, ?>> $$0, dij $$1, dvn.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.aN) || $$0.a(dil.fl) || $$0.a(dil.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<eeb<?, ?>>> a(dfi $$0) {
      return $$0.H_().e(ma.aJ).a(this.e);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      dvo $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      this.a($$0).ifPresent($$3x -> ((eeb)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
