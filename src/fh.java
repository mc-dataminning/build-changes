import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fh<T extends cw<?>> extends ArgumentType<T> {
   static fh.b a() {
      return new fh.b();
   }

   static fh.a b() {
      return new fh.a();
   }

   public static class a implements fh<cw.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cw.c a(CommandContext<ej> $$0, String $$1) {
         return (cw.c)$$0.getArgument($$1, cw.c.class);
      }

      public cw.c a(StringReader $$0) throws CommandSyntaxException {
         return cw.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fh<cw.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cw.d a(CommandContext<ej> $$0, String $$1) {
         return (cw.d)$$0.getArgument($$1, cw.d.class);
      }

      public cw.d a(StringReader $$0) throws CommandSyntaxException {
         return cw.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
