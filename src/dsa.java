import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsa extends dpt implements drv {
   public static final MapCodec<dsa> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drv.a.e.fieldOf("weathering_state").forGetter(djr::c), t()).apply($$0, dsa::new)
   );
   private final drv.a g;

   @Override
   public MapCodec<dsa> a() {
      return f;
   }

   public dsa(drv.a $$0, dvu.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
