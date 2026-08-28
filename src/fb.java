import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class fb {
   public static <T> T a(Codec<T> $$0, jt.a $$1, DynamicCommandExceptionType $$2, StringReader $$3) throws CommandSyntaxException {
      int $$4 = $$3.getCursor();
      un $$5 = new uo($$3).d();
      DataResult<T> $$6 = $$0.parse($$1.a(ue.a), $$5);
      return (T)$$6.getOrThrow($$3x -> {
         $$3.setCursor($$4);
         return $$2.createWithContext($$3, $$3x);
      });
   }

   public static String a(StringReader $$0, m $$1) {
      int $$2 = $$0.getCursor();

      while ($$0.canRead() && $$1.test($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$2, $$0.getCursor());
   }
}
