import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dng extends dnc implements dnf {
   public static final MapCodec<dng> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dng::new)
   );
   private final alh<ejv<?, ?>> b;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(alh<ejv<?, ?>> $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.J_().a(mh.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ejv)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dnf.a ar_() {
      return dnf.a.a;
   }
}
