import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djr extends djn implements djq {
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, djr::new)
   );
   private final aku<efl<?, ?>> b;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(aku<efl<?, ?>> $$0, dwx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      $$0.K_().a(mc.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((efl)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public djq.a aq_() {
      return djq.a.a;
   }
}
