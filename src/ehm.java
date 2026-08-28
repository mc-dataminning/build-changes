import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehm extends ehq {
   private final ji<ewf> e;
   public static final MapCodec<ehm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ehm::new)
   );

   public ehm(jz $$0, ji<ewf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public ehg<?> a() {
      return ehg.c;
   }
}
