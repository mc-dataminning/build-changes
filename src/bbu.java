import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bbu extends bbw {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bbu(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bbu::a);
   }

   private static String a(String $$0) {
      String $$1 = bky.a($$0);

      for (String $$2 : a) {
         String $$3 = bky.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
