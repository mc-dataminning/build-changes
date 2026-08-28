import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bbf extends bbh {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bbf(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bbf::a);
   }

   private static String a(String $$0) {
      String $$1 = bjg.a($$0);

      for (String $$2 : a) {
         String $$3 = bjg.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
