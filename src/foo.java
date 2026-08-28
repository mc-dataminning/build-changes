import java.util.function.UnaryOperator;

public class foo {
   @Deprecated
   public static aku a(String $$0) {
      return aku.b("block/" + $$0);
   }

   public static aku b(String $$0) {
      return aku.b("item/" + $$0);
   }

   public static aku a(dke $$0, String $$1) {
      aku $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aku a(dke $$0) {
      aku $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static aku a(cxd $$0) {
      aku $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static aku a(cxd $$0, String $$1) {
      aku $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
