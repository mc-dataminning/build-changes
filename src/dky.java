import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dky extends dku implements dkx {
   public static final MapCodec<dky> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a(me.aP).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dky::new)
   );
   private final alc<ehd<?, ?>> b;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(alc<ehd<?, ?>> $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      $$0.F_().a(me.aP).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ehd)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dkx.a am_() {
      return dkx.a.a;
   }
}
