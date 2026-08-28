import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlg extends dkm {
   public static final MapCodec<dlg> a = b(dlg::new);
   private static final xv b = xv.c("container.cartography_table");

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aw);
      }

      return btj.a;
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new ctk($$2x, $$3, ctp.a($$1, $$2)), b);
   }
}
