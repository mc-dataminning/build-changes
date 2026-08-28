import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fr<T extends dh<?>> extends ArgumentType<T> {
   static fr.b a() {
      return new fr.b();
   }

   static fr.a b() {
      return new fr.a();
   }

   public static class a implements fr<dh.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static dh.c a(CommandContext<et> $$0, String $$1) {
         return (dh.c)$$0.getArgument($$1, dh.c.class);
      }

      public dh.c a(StringReader $$0) throws CommandSyntaxException {
         return dh.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fr<dh.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static dh.d a(CommandContext<et> $$0, String $$1) {
         return (dh.d)$$0.getArgument($$1, dh.d.class);
      }

      public dh.d a(StringReader $$0) throws CommandSyntaxException {
         return dh.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
