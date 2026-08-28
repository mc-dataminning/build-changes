import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drw extends dke implements drv {
   public static final MapCodec<drw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drv.a.e.fieldOf("weathering_state").forGetter(drw::q), t()).apply($$0, drw::new)
   );
   private final drv.a e;

   @Override
   protected MapCodec<drw> a() {
      return d;
   }

   public drw(drv.a $$0, dvu.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
