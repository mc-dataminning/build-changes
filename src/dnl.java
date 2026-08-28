import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnl extends dko implements dkh {
   public static final MapCodec<dnl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aK).fieldOf("feature").forGetter($$0x -> $$0x.e), ma.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dnl::new)
   );
   protected static final fcm b = dke.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dke d;
   private final aly<ega<?, ?>> e;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(aly<ega<?, ?>> $$0, dke $$1, dxm.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dkg.fz) || $$0.a(dkg.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<ega<?, ?>>> a(dhd $$0) {
      return $$0.K_().e(mb.aK).a(this.e);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      dxn $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      this.a($$0).ifPresent($$3x -> ((ega)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
