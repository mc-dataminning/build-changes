import com.mojang.serialization.MapCodec;

public class dpg extends dok {
   public static final MapCodec<dpg> a = b(dpg::new);
   private static final xv b = xv.c("container.loom");

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ax);
      }

      return btj.a;
   }

   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new cuj($$2x, $$3, ctp.a($$1, $$2)), b);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF);
   }
}
