import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fb<T extends ct<?>> extends ArgumentType<T> {
   static fb.b a() {
      return new fb.b();
   }

   static fb.a b() {
      return new fb.a();
   }

   public static class a implements fb<ct.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static ct.c a(CommandContext<ed> $$0, String $$1) {
         return (ct.c)$$0.getArgument($$1, ct.c.class);
      }

      public ct.c a(StringReader $$0) throws CommandSyntaxException {
         return ct.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fb<ct.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static ct.d a(CommandContext<ed> $$0, String $$1) {
         return (ct.d)$$0.getArgument($$1, ct.d.class);
      }

      public ct.d a(StringReader $$0) throws CommandSyntaxException {
         return ct.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
