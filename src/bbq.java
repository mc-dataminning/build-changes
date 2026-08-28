import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bbq extends bbs {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bbq(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bbq::a);
   }

   private static String a(String $$0) {
      String $$1 = bku.a($$0);

      for (String $$2 : a) {
         String $$3 = bku.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
