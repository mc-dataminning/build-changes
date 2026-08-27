import javax.annotation.Nullable;

public class ctd extends csl {
   private static final tf a = tf.c("container.cartography_table");

   protected ctd(dey.d $$0) {
      super($$0);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apg.aw);
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      return new bgy(($$2x, $$3, $$4) -> new cej($$2x, $$3, ceo.a($$1, $$2)), a);
   }
}
