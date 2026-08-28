import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzt extends dzx {
   private final jn<eog> e;
   public static final MapCodec<dzt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzt::new)
   );

   public dzt(ke $$0, jn<eog> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzn<?> a() {
      return dzn.c;
   }
}
