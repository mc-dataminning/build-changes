import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djo extends djk implements djn {
   public static final MapCodec<djo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, djo::new)
   );
   private final akt<efi<?, ?>> b;

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(akt<efi<?, ?>> $$0, dwu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      $$0.K_().a(mc.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((efi)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public djn.a aq_() {
      return djn.a.a;
   }
}
