import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;

public class en {
   public static <T> T a(Codec<T> $$0, jh.a $$1, DynamicCommandExceptionType $$2, StringReader $$3) throws CommandSyntaxException {
      return a(JavaOps.INSTANCE, $$0, $$1, $$2, $$3);
   }

   public static <T, O> T a(DynamicOps<O> $$0, Codec<T> $$1, jh.a $$2, DynamicCommandExceptionType $$3, StringReader $$4) throws CommandSyntaxException {
      int $$5 = $$4.getCursor();
      ale<O> $$6 = $$2.a($$0);
      O $$7 = ux.b($$6, $$4);
      DataResult<T> $$8 = $$1.parse($$6, $$7);
      return (T)$$8.getOrThrow($$3x -> {
         $$4.setCursor($$5);
         return $$3.createWithContext($$4, $$3x);
      });
   }

   public static String a(StringReader $$0, n $$1) {
      int $$2 = $$0.getCursor();

      while ($$0.canRead() && $$1.test($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$2, $$0.getCursor());
   }
}
