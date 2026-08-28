import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dki extends dke implements dkh {
   public static final MapCodec<dki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aK).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dki::new)
   );
   private final aly<ega<?, ?>> b;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(aly<ega<?, ?>> $$0, dxm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      $$0.K_().a(mb.aK).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ega)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dkh.a ar_() {
      return dkh.a.a;
   }
}
