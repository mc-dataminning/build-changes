import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djp extends djl implements djo {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, djp::new)
   );
   private final aku<efj<?, ?>> b;

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(aku<efj<?, ?>> $$0, dwv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      $$0.K_().a(mc.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((efj)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public djo.a aq_() {
      return djo.a.a;
   }
}
