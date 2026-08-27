import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyg extends dyl {
   private final jb<ddy> e;
   public static final MapCodec<dyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jm.a(lf.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dyg::new)
   );

   public dyg(js $$0, jb<ddy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dyb<?> a() {
      return dyb.a;
   }
}
