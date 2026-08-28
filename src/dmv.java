import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmv extends dmr implements dmu {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dmv::new)
   );
   private final alf<ejk<?, ?>> b;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(alf<ejk<?, ?>> $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.F_().a(mh.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ejk)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dmu.a an_() {
      return dmu.a.a;
   }
}
