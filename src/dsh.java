import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsh extends diz {
   public static final MapCodec<dsh> a = b(dsh::new);
   public static final dxv<dwe> b = dxo.bB;
   public static final dxp c = dxo.bD;

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwe.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, duc.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dxo.bD).orElse(false)))
         : a($$2, duc.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dxo.bD).orElse(false)));
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhe.a($$0, $$2, "spawn_data");
   }
}
