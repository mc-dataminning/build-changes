import java.util.function.UnaryOperator;

public class ftm {
   @Deprecated
   public static alk a(String $$0) {
      return alk.b("block/" + $$0);
   }

   public static alk b(String $$0) {
      return alk.b("item/" + $$0);
   }

   public static alk a(dne $$0, String $$1) {
      alk $$2 = mh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alk a(dne $$0) {
      alk $$1 = mh.e.b($$0);
      return $$1.f("block/");
   }

   public static alk a(czw $$0) {
      alk $$1 = mh.g.b($$0);
      return $$1.f("item/");
   }

   public static alk a(czw $$0, String $$1) {
      alk $$2 = mh.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
