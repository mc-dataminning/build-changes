import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpm extends dpq {
   private final ij<edy> e;
   public static final Codec<dpm> a = RecordCodecBuilder.create($$0 -> a($$0).and(it.a(kc.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dpm::new));

   public dpm(iz $$0, ij<edy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dip $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dpg<?> a() {
      return dpg.c;
   }
}
