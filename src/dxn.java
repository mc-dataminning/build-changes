import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxn extends dno implements dxk {
   public static final MapCodec<dxn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.e.fieldOf("weathering_state").forGetter(dor::c), t()).apply($$0, dxn::new)
   );
   private final dxk.a e;

   @Override
   public MapCodec<dxn> a() {
      return d;
   }

   public dxn(dxk.a $$0, ebp.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
