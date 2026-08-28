import java.util.function.UnaryOperator;

public class fqp {
   @Deprecated
   public static ale a(String $$0) {
      return ale.b("block/" + $$0);
   }

   public static ale b(String $$0) {
      return ale.b("item/" + $$0);
   }

   public static ale a(dlu $$0, String $$1) {
      ale $$2 = mf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ale a(dlu $$0) {
      ale $$1 = mf.e.b($$0);
      return $$1.f("block/");
   }

   public static ale a(cyo $$0) {
      ale $$1 = mf.g.b($$0);
      return $$1.f("item/");
   }

   public static ale a(cyo $$0, String $$1) {
      ale $$2 = mf.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
