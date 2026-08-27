import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface es<T extends cm<?>> extends ArgumentType<T> {
   static es.b a() {
      return new es.b();
   }

   static es.a b() {
      return new es.a();
   }

   public static class a implements es<cm.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cm.c a(CommandContext<du> $$0, String $$1) {
         return (cm.c)$$0.getArgument($$1, cm.c.class);
      }

      public cm.c a(StringReader $$0) throws CommandSyntaxException {
         return cm.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements es<cm.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cm.d a(CommandContext<du> $$0, String $$1) {
         return (cm.d)$$0.getArgument($$1, cm.d.class);
      }

      public cm.d a(StringReader $$0) throws CommandSyntaxException {
         return cm.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
