import com.mojang.brigadier.StringReader;

public class en {
   public static String a(StringReader $$0, n $$1) {
      int $$2 = $$0.getCursor();

      while ($$0.canRead() && $$1.test($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$2, $$0.getCursor());
   }
}
