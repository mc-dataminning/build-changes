import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fu<T extends dj<?>> extends ArgumentType<T> {
   static fu.b a() {
      return new fu.b();
   }

   static fu.a b() {
      return new fu.a();
   }

   public static class a implements fu<dj.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static dj.c a(CommandContext<ew> $$0, String $$1) {
         return (dj.c)$$0.getArgument($$1, dj.c.class);
      }

      public dj.c a(StringReader $$0) throws CommandSyntaxException {
         return dj.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fu<dj.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static dj.d a(CommandContext<ew> $$0, String $$1) {
         return (dj.d)$$0.getArgument($$1, dj.d.class);
      }

      public dj.d a(StringReader $$0) throws CommandSyntaxException {
         return dj.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
