import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface eo<T extends cj<?>> extends ArgumentType<T> {
   static eo.b a() {
      return new eo.b();
   }

   static eo.a b() {
      return new eo.a();
   }

   public static class a implements eo<cj.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cj.c a(CommandContext<ds> $$0, String $$1) {
         return (cj.c)$$0.getArgument($$1, cj.c.class);
      }

      public cj.c a(StringReader $$0) throws CommandSyntaxException {
         return cj.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements eo<cj.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cj.d a(CommandContext<ds> $$0, String $$1) {
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
