import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bbc extends bbe {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bbc(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bbc::a);
   }

   private static String a(String $$0) {
      String $$1 = bju.a($$0);

      for (String $$2 : a) {
         String $$3 = bju.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
