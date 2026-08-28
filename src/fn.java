import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fn<T extends de<?>> extends ArgumentType<T> {
   static fn.b a() {
      return new fn.b();
   }

   static fn.a b() {
      return new fn.a();
   }

   public static class a implements fn<de.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static de.c a(CommandContext<ep> $$0, String $$1) {
         return (de.c)$$0.getArgument($$1, de.c.class);
      }

      public de.c a(StringReader $$0) throws CommandSyntaxException {
         return de.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fn<de.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static de.d a(CommandContext<ep> $$0, String $$1) {
         return (de.d)$$0.getArgument($$1, de.d.class);
      }

      public de.d a(StringReader $$0) throws CommandSyntaxException {
         return de.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
