import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dmm implements dmp {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dmq::new)
   );
   private final alf<ejf<?, ?>> b;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(alf<ejf<?, ?>> $$0, ean.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      $$0.F_().a(mh.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ejf)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dmp.a an_() {
      return dmp.a.a;
   }
}
