import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dma implements dmd {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.aK).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dme::new)
   );
   private final alf<eiq<?, ?>> b;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(alf<eiq<?, ?>> $$0, dzy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      $$0.F_().a(mg.aK).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((eiq)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dmd.a am_() {
      return dmd.a.a;
   }
}
