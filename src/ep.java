import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface ep<T extends cl<?>> extends ArgumentType<T> {
   static ep.b a() {
      return new ep.b();
   }

   static ep.a b() {
      return new ep.a();
   }

   public static class a implements ep<cl.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cl.c a(CommandContext<dt> $$0, String $$1) {
         return (cl.c)$$0.getArgument($$1, cl.c.class);
      }

      public cl.c a(StringReader $$0) throws CommandSyntaxException {
         return cl.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements ep<cl.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cl.d a(CommandContext<dt> $$0, String $$1) {
         return (cl.d)$$0.getArgument($$1, cl.d.class);
      }

      public cl.d a(StringReader $$0) throws CommandSyntaxException {
         return cl.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
