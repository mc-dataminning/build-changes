import java.util.function.UnaryOperator;

public class fnq {
   @Deprecated
   public static akv a(String $$0) {
      return akv.b("block/" + $$0);
   }

   public static akv b(String $$0) {
      return akv.b("item/" + $$0);
   }

   public static akv a(djl $$0, String $$1) {
      akv $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akv a(djl $$0) {
      akv $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static akv a(cwk $$0) {
      akv $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static akv a(cwk $$0, String $$1) {
      akv $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
