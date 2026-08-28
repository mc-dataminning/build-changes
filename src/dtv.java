import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv extends dse implements dtp {
   public static final MapCodec<dtv> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.e.fieldOf("weathering_state").forGetter(dlg::c), dxq.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dtv::new)
   );
   private final dtp.a h;

   @Override
   public MapCodec<dtv> a() {
      return g;
   }

   public dtv(dtp.a $$0, dxq $$1, dxp.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxq $$0) {
      return dtp.c($$0.b()).isPresent();
   }

   public dtp.a q() {
      return this.h;
   }
}
