import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eam extends eaq {
   private final jq<epb> e;
   public static final MapCodec<eam> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kb.a(lu.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eam::new)
   );

   public eam(kh $$0, jq<epb> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public eag<?> a() {
      return eag.c;
   }
}
