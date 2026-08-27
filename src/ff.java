import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface ff<T extends cu<?>> extends ArgumentType<T> {
   static ff.b a() {
      return new ff.b();
   }

   static ff.a b() {
      return new ff.a();
   }

   public static class a implements ff<cu.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cu.c a(CommandContext<eh> $$0, String $$1) {
         return (cu.c)$$0.getArgument($$1, cu.c.class);
      }

      public cu.c a(StringReader $$0) throws CommandSyntaxException {
         return cu.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements ff<cu.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cu.d a(CommandContext<eh> $$0, String $$1) {
         return (cu.d)$$0.getArgument($$1, cu.d.class);
      }

      public cu.d a(StringReader $$0) throws CommandSyntaxException {
         return cu.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
