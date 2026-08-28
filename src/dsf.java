import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsf extends dix {
   public static final MapCodec<dsf> a = b(dsf::new);
   public static final dxt<dwc> b = dxm.bB;
   public static final dxn c = dxm.bD;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwc.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, dua.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dxm.bD).orElse(false)))
         : a($$2, dua.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dxm.bD).orElse(false)));
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhc.a($$0, $$2, "spawn_data");
   }
}
