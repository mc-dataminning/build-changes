import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxe extends dvg implements dwy {
   public static final MapCodec<dxe> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwy.a.e.fieldOf("weathering_state").forGetter(dof::c), ebe.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dxe::new)
   );
   private final dwy.a h;

   @Override
   public MapCodec<dxe> a() {
      return g;
   }

   public dxe(dwy.a $$0, ebe $$1, ebd.d $$2) {
      super($$1, $$2);
      this.h = $$0;
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
      return this.h;
   }
}
