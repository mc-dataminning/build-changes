import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bbj extends bbl {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bbj(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bbj::a);
   }

   private static String a(String $$0) {
      String $$1 = bjo.a($$0);

      for (String $$2 : a) {
         String $$3 = bjo.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
