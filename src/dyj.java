import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyj extends dyn {
   private final jb<emv> e;
   public static final MapCodec<dyj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jm.a(lf.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dyj::new)
   );

   public dyj(js $$0, jb<emv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drd $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dyd<?> a() {
      return dyd.c;
   }
}
