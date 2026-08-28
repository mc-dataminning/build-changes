import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzn extends dzr {
   private final jn<eoa> e;
   public static final MapCodec<dzn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzn::new)
   );

   public dzn(ke $$0, jn<eoa> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzh<?> a() {
      return dzh.c;
   }
}
