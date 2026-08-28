import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsw extends djq {
   public static final MapCodec<dsw> a = b(dsw::new);
   public static final dyk<dwt> b = dyd.bz;
   public static final dye c = dyd.bC;

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   public dsw(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwt.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, dur.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dyd.bC).orElse(false)))
         : a($$2, dur.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dyd.bC).orElse(false)));
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhv.a($$0, $$2, "spawn_data");
   }
}
