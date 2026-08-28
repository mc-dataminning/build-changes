import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eef extends eek {
   private final jv<djm> e;
   public static final MapCodec<eef> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eef::new)
   );

   public eef(km $$0, jv<djm> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eea<?> a() {
      return eea.a;
   }
}
