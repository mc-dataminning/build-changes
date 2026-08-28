import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnk extends dkn implements dkg {
   public static final MapCodec<dnk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alo.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), ma.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dnk::new)
   );
   protected static final fcl b = dkd.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dkd d;
   private final alo<egb<?, ?>> e;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   protected dnk(alo<egb<?, ?>> $$0, dkd $$1, dxn.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(axk.aO) || $$0.a(dkf.fA) || $$0.a(dkf.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<egb<?, ?>>> a(dhc $$0) {
      return $$0.K_().e(mb.aL).a(this.e);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      dxo $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      this.a($$0).ifPresent($$3x -> ((egb)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
