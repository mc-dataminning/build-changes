import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public interface bqf<T extends Exception> {
   T create(String var1, int var2);

   static bqf<CommandSyntaxException> a(SimpleCommandExceptionType $$0) {
      return ($$1, $$2) -> $$0.createWithContext(bqz.a($$1, $$2));
   }

   static bqf<CommandSyntaxException> a(DynamicCommandExceptionType $$0, String $$1) {
      return ($$2, $$3) -> $$0.createWithContext(bqz.a($$2, $$3), $$1);
   }
}
