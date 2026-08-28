import java.util.function.UnaryOperator;

public class fri {
   @Deprecated
   public static alg a(String $$0) {
      return alg.b("block/" + $$0);
   }

   public static alg b(String $$0) {
      return alg.b("item/" + $$0);
   }

   public static alg a(dmf $$0, String $$1) {
      alg $$2 = mf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alg a(dmf $$0) {
      alg $$1 = mf.e.b($$0);
      return $$1.f("block/");
   }

   public static alg a(cyz $$0) {
      alg $$1 = mf.g.b($$0);
      return $$1.f("item/");
   }

   public static alg a(cyz $$0, String $$1) {
      alg $$2 = mf.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
