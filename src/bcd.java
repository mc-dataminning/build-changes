import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bcd extends bcf {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bcd(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bcd::a);
   }

   private static String a(String $$0) {
      String $$1 = blh.a($$0);

      for (String $$2 : a) {
         String $$3 = blh.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
