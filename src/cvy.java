import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvy extends cvf {
   public static final MapCodec<cvy> a = b(cvy::new);
   private static final uv b = uv.c("container.cartography_table");

   @Override
   public MapCodec<cvy> a() {
      return a;
   }

   protected cvy(dhm.d $$0) {
      super($$0);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.aw);
         return bjb.b;
      }
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new cgx($$2x, $$3, chc.a($$1, $$2)), b);
   }
}
