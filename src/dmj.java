import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmj extends dmf implements dmi {
   public static final MapCodec<dmj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dmj::new)
   );
   private final alf<eiy<?, ?>> b;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(alf<eiy<?, ?>> $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.F_().a(mg.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((eiy)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dmi.a an_() {
      return dmi.a.a;
   }
}
