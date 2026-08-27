import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmi extends dmm {
   private final hk<ean> e;
   public static final Codec<dmi> a = RecordCodecBuilder.create($$0 -> a($$0).and(hv.a(je.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dmi::new));

   public dmi(ib $$0, hk<ean> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfl $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dmc<?> a() {
      return dmc.c;
   }
}
