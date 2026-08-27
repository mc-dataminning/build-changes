import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface eq<T extends ck<?>> extends ArgumentType<T> {
   static eq.b a() {
      return new eq.b();
   }

   static eq.a b() {
      return new eq.a();
   }

   public static class a implements eq<ck.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static ck.c a(CommandContext<ds> $$0, String $$1) {
         return (ck.c)$$0.getArgument($$1, ck.c.class);
      }

      public ck.c a(StringReader $$0) throws CommandSyntaxException {
         return ck.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements eq<ck.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static ck.d a(CommandContext<ds> $$0, String $$1) {
         return (ck.d)$$0.getArgument($$1, ck.d.class);
      }

      public ck.d a(StringReader $$0) throws CommandSyntaxException {
         return ck.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
