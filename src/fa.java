import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fa<T extends cs<?>> extends ArgumentType<T> {
   static fa.b a() {
      return new fa.b();
   }

   static fa.a b() {
      return new fa.a();
   }

   public static class a implements fa<cs.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cs.c a(CommandContext<ec> $$0, String $$1) {
         return (cs.c)$$0.getArgument($$1, cs.c.class);
      }

      public cs.c a(StringReader $$0) throws CommandSyntaxException {
         return cs.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fa<cs.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cs.d a(CommandContext<ec> $$0, String $$1) {
         return (cs.d)$$0.getArgument($$1, cs.d.class);
      }

      public cs.d a(StringReader $$0) throws CommandSyntaxException {
         return cs.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
