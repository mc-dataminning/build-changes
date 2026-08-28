import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc extends dwx implements dwy {
   public static final MapCodec<dxc> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwy.a.e.fieldOf("weathering_state").forGetter(dxc::q), t()).apply($$0, dxc::new)
   );
   private final dwy.a f;

   @Override
   protected MapCodec<dxc> a() {
      return e;
   }

   protected dxc(dwy.a $$0, ebd.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebe $$0) {
      return dwy.c($$0.b()).isPresent();
   }

   public dwy.a q() {
      return this.f;
   }
}
