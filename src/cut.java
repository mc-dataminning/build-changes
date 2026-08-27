import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cut extends cua {
   public static final MapCodec<cut> a = b(cut::new);
   private static final ui b = ui.c("container.cartography_table");

   @Override
   public MapCodec<cut> a() {
      return a;
   }

   protected cut(dga.d $$0) {
      super($$0);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.aw);
         return bib.b;
      }
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new cfv($$2x, $$3, cga.a($$1, $$2)), b);
   }
}
