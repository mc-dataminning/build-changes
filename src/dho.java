import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dho extends dgv {
   public static final MapCodec<dho> a = b(dho::new);
   private static final xd b = xd.c("container.cartography_table");

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   protected dho(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awn.aw);
      }

      return brk.a;
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return new brs(($$2x, $$3, $$4) -> new cqy($$2x, $$3, crd.a($$1, $$2)), b);
   }
}
