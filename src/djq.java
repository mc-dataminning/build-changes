import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djq extends djm implements djp {
   public static final MapCodec<djq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, djq::new)
   );
   private final akt<efk<?, ?>> b;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(akt<efk<?, ?>> $$0, dww.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      $$0.K_().a(mc.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((efk)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public djp.a aq_() {
      return djp.a.a;
   }
}
