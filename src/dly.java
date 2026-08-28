import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dly extends dlu implements dlx {
   public static final MapCodec<dly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(mg.aK).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dly::new)
   );
   private final ald<eif<?, ?>> b;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(ald<eif<?, ?>> $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      $$0.F_().a(mg.aK).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((eif)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dlx.a am_() {
      return dlx.a.a;
   }
}
