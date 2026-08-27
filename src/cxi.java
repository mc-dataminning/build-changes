import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxi extends cwp {
   public static final MapCodec<cxi> a = b(cxi::new);
   private static final vf b = vf.c("container.cartography_table");

   @Override
   public MapCodec<cxi> a() {
      return a;
   }

   protected cxi(djf.d $$0) {
      super($$0);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.aw);
         return bka.b;
      }
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cig($$2x, $$3, cil.a($$1, $$2)), b);
   }
}
