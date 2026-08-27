import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxn extends dxr {
   private final ja<elz> e;
   public static final Codec<dxn> a = RecordCodecBuilder.create($$0 -> a($$0).and(jl.a(le.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dxn::new));

   public dxn(jr $$0, ja<elz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dqh $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dxh<?> a() {
      return dxh.c;
   }
}
