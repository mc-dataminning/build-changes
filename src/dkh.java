import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkh extends dkd implements dkg {
   public static final MapCodec<dkh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alo.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dkh::new)
   );
   private final alo<egb<?, ?>> b;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(alo<egb<?, ?>> $$0, dxn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      $$0.K_().a(mb.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((egb)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dkg.a ar_() {
      return dkg.a.a;
   }
}
