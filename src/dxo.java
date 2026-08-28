import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo extends dxj implements dxk {
   public static final MapCodec<dxo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.e.fieldOf("weathering_state").forGetter(dxo::q), t()).apply($$0, dxo::new)
   );
   private final dxk.a f;

   @Override
   protected MapCodec<dxo> a() {
      return e;
   }

   protected dxo(dxk.a $$0, ebp.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebq $$0) {
      return dxk.c($$0.b()).isPresent();
   }

   public dxk.a q() {
      return this.f;
   }
}
