import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpj extends dvj implements dmd {
   public static final MapCodec<dpj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.aK).fieldOf("feature").forGetter($$0x -> $$0x.e), mf.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dpj::new)
   );
   private static final double b = 0.4;
   private static final ffc c = dma.b(8.0, 0.0, 9.0);
   private final dma d;
   private final alf<eiq<?, ?>> e;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   protected dpj(alf<eiq<?, ?>> $$0, dma $$1, dzy.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(axc.aO) || $$0.a(dmc.fB) || $$0.a(dmc.el) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends je<eiq<?, ?>>> a(diy $$0) {
      return $$0.F_().f(mg.aK).a(this.e);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      dzz $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.a($$0).ifPresent($$3x -> ((eiq)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
