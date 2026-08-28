import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dse extends diw {
   public static final MapCodec<dse> a = b(dse::new);
   public static final dxs<dwb> b = dxl.bB;
   public static final dxm c = dxl.bD;

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   public dse(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwb.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0 instanceof arc $$3
         ? a($$2, dtz.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dxl.bD).orElse(false)))
         : a($$2, dtz.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dxl.bD).orElse(false)));
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhb.a($$0, $$2, "spawn_data");
   }
}
