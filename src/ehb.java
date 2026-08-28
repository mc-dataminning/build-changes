import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehb extends ehf {
   private final ji<evu> e;
   public static final MapCodec<ehb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ehb::new)
   );

   public ehb(jz $$0, ji<evu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dzo $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public egv<?> a() {
      return egv.c;
   }
}
