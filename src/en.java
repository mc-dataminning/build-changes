import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface en<T extends cj<?>> extends ArgumentType<T> {
   static en.b a() {
      return new en.b();
   }

   static en.a b() {
      return new en.a();
   }

   public static class a implements en<cj.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cj.c a(CommandContext<dr> $$0, String $$1) {
         return (cj.c)$$0.getArgument($$1, cj.c.class);
      }

      public cj.c a(StringReader $$0) throws CommandSyntaxException {
         return cj.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements en<cj.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cj.d a(CommandContext<dr> $$0, String $$1) {
         return (cj.d)$$0.getArgument($$1, cj.d.class);
      }

      public cj.d a(StringReader $$0) throws CommandSyntaxException {
         return cj.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
