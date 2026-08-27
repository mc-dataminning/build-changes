import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyi extends dyn {
   private final jb<dea> e;
   public static final MapCodec<dyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jm.a(lf.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dyi::new)
   );

   public dyi(js $$0, jb<dea> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drd $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dyd<?> a() {
      return dyd.a;
   }
}
