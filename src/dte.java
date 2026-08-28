import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dte extends djy {
   public static final MapCodec<dte> a = b(dte::new);
   public static final dys<dxb> b = dyl.bz;
   public static final dym c = dyl.bC;

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxb.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, duz.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dyl.bC).orElse(false)))
         : a($$2, duz.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dyl.bC).orElse(false)));
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      did.a($$0, $$2, "spawn_data");
   }
}
