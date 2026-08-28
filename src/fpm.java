import java.util.function.UnaryOperator;

public class fpm {
   @Deprecated
   public static ald a(String $$0) {
      return ald.b("block/" + $$0);
   }

   public static ald b(String $$0) {
      return ald.b("item/" + $$0);
   }

   public static ald a(dku $$0, String $$1) {
      ald $$2 = md.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ald a(dku $$0) {
      ald $$1 = md.e.b($$0);
      return $$1.f("block/");
   }

   public static ald a(cxu $$0) {
      ald $$1 = md.g.b($$0);
      return $$1.f("item/");
   }

   public static ald a(cxu $$0, String $$1) {
      ald $$2 = md.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
