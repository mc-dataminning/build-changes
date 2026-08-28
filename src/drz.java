import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz extends dru implements drv {
   public static final MapCodec<drz> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drv.a.e.fieldOf("weathering_state").forGetter(drz::q), t()).apply($$0, drz::new)
   );
   private final drv.a f;

   @Override
   protected MapCodec<drz> a() {
      return e;
   }

   protected drz(drv.a $$0, dvu.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvv $$0) {
      return drv.c($$0.b()).isPresent();
   }

   public drv.a q() {
      return this.f;
   }
}
