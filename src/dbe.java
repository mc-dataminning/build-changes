import com.mojang.serialization.MapCodec;

public class dbe extends cvs {
   public static final MapCodec<dbe> b = b(dbe::new);
   private static final ui c = ui.c("container.upgrade");

   @Override
   public MapCodec<dbe> a() {
      return b;
   }

   protected dbe(dga.d $$0) {
      super($$0);
   }

   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new chi($$2x, $$3, cga.a($$1, $$2)), c);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.aF);
         return bib.b;
      }
   }
}
