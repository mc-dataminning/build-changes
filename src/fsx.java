import java.util.function.UnaryOperator;

public class fsx {
   @Deprecated
   public static alr a(String $$0) {
      return alr.b("block/" + $$0);
   }

   public static alr b(String $$0) {
      return alr.b("item/" + $$0);
   }

   public static alr a(dno $$0, String $$1) {
      alr $$2 = mh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alr a(dno $$0) {
      alr $$1 = mh.e.b($$0);
      return $$1.f("block/");
   }

   public static alr a(dag $$0) {
      alr $$1 = mh.g.b($$0);
      return $$1.f("item/");
   }

   public static alr a(dag $$0, String $$1) {
      alr $$2 = mh.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
