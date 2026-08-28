import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fg<T extends cv<?>> extends ArgumentType<T> {
   static fg.b a() {
      return new fg.b();
   }

   static fg.a b() {
      return new fg.a();
   }

   public static class a implements fg<cv.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cv.c a(CommandContext<ei> $$0, String $$1) {
         return (cv.c)$$0.getArgument($$1, cv.c.class);
      }

      public cv.c a(StringReader $$0) throws CommandSyntaxException {
         return cv.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fg<cv.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cv.d a(CommandContext<ei> $$0, String $$1) {
         return (cv.d)$$0.getArgument($$1, cv.d.class);
      }

      public cv.d a(StringReader $$0) throws CommandSyntaxException {
         return cv.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
