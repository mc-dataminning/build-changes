import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehu extends ehy {
   private final ji<ewn> e;
   public static final MapCodec<ehu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ehu::new)
   );

   public ehu(jz $$0, ji<ewn> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eho<?> a() {
      return eho.c;
   }
}
