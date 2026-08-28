import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bcb extends bcd {
   private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

   public bcb(Schema $$0) {
      super($$0, "AttributeIdPrefixFix", bcb::a);
   }

   private static String a(String $$0) {
      String $$1 = bkg.a($$0);

      for (String $$2 : a) {
         String $$3 = bkg.a($$2);
         if ($$1.startsWith($$3)) {
            return "minecraft:" + $$1.substring($$3.length());
         }
      }

      return $$0;
   }
}
