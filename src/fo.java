import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fo<T extends de<?>> extends ArgumentType<T> {
   static fo.b a() {
      return new fo.b();
   }

   static fo.a b() {
      return new fo.a();
   }

   public static class a implements fo<de.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static de.c a(CommandContext<eq> $$0, String $$1) {
         return (de.c)$$0.getArgument($$1, de.c.class);
      }

      public de.c a(StringReader $$0) throws CommandSyntaxException {
         return de.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fo<de.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static de.d a(CommandContext<eq> $$0, String $$1) {
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
