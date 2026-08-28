import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dld extends dih implements dib {
   public static final MapCodec<dld> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a(ly.aJ).fieldOf("feature").forGetter($$0x -> $$0x.e), lx.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dld::new)
   );
   protected static final fab b = dhy.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dhy d;
   private final alg<edr<?, ?>> e;

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(alg<edr<?, ?>> $$0, dhy $$1, dvc.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.aM) || $$0.a(dia.fl) || $$0.a(dia.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jp<edr<?, ?>>> a(dey $$0) {
      return $$0.H_().e(ly.aJ).a(this.e);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      dvd $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.a($$0).ifPresent($$3x -> ((edr)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
