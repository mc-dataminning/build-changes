import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eht extends ehy {
   private final ji<dmf> e;
   public static final MapCodec<eht> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eht::new)
   );

   public eht(jz $$0, ji<dmf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eho<?> a() {
      return eho.a;
   }
}
