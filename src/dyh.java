import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyh extends dyl {
   private final jb<emt> e;
   public static final MapCodec<dyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jm.a(lf.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dyh::new)
   );

   public dyh(js $$0, jb<emt> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drb $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dyb<?> a() {
      return dyb.c;
   }
}
