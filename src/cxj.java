import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxj extends cwq {
   public static final MapCodec<cxj> a = b(cxj::new);
   private static final vf b = vf.c("container.cartography_table");

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   protected cxj(djg.d $$0) {
      super($$0);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.aw);
         return bkb.b;
      }
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cih($$2x, $$3, cim.a($$1, $$2)), b);
   }
}
