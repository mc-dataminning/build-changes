import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dki extends dke implements dkh {
   public static final MapCodec<dki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aM).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dki::new)
   );
   private final akt<egg<?, ?>> b;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(akt<egg<?, ?>> $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      $$0.F_().a(mc.aM).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((egg)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dkh.a aq_() {
      return dkh.a.a;
   }
}
