import java.util.function.UnaryOperator;

public class ftk {
   @Deprecated
   public static ali a(String $$0) {
      return ali.b("block/" + $$0);
   }

   public static ali b(String $$0) {
      return ali.b("item/" + $$0);
   }

   public static ali a(dnc $$0, String $$1) {
      ali $$2 = mg.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ali a(dnc $$0) {
      ali $$1 = mg.e.b($$0);
      return $$1.f("block/");
   }

   public static ali a(czu $$0) {
      ali $$1 = mg.g.b($$0);
      return $$1.f("item/");
   }

   public static ali a(czu $$0, String $$1) {
      ali $$2 = mg.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
