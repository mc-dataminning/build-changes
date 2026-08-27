import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxm extends dxr {
   private final ja<dde> e;
   public static final Codec<dxm> a = RecordCodecBuilder.create($$0 -> a($$0).and(jl.a(le.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dxm::new));

   public dxm(jr $$0, ja<dde> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dqh $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dxh<?> a() {
      return dxh.a;
   }
}
