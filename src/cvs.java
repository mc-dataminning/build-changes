import com.mojang.serialization.MapCodec;

public class cvs extends cua {
   public static final MapCodec<cvs> a = b(cvs::new);
   private static final ui b = ui.c("container.crafting");

   @Override
   public MapCodec<? extends cvs> a() {
      return a;
   }

   protected cvs(dga.d $$0) {
      super($$0);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.an);
         return bib.b;
      }
   }

   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new cge($$2x, $$3, cga.a($$1, $$2)), b);
   }
}
