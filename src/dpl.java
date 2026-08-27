import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpl extends dpq {
   private final ij<cvz> e;
   public static final Codec<dpl> a = RecordCodecBuilder.create($$0 -> a($$0).and(it.a(kc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dpl::new));

   public dpl(iz $$0, ij<cvz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dip $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dpg<?> a() {
      return dpg.a;
   }
}
