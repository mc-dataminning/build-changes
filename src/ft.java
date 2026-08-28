import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface ft<T extends di<?>> extends ArgumentType<T> {
   static ft.b a() {
      return new ft.b();
   }

   static ft.a b() {
      return new ft.a();
   }

   public static class a implements ft<di.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static di.c a(CommandContext<ev> $$0, String $$1) {
         return (di.c)$$0.getArgument($$1, di.c.class);
      }

      public di.c a(StringReader $$0) throws CommandSyntaxException {
         return di.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements ft<di.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static di.d a(CommandContext<ev> $$0, String $$1) {
         return (di.d)$$0.getArgument($$1, di.d.class);
      }

      public di.d a(StringReader $$0) throws CommandSyntaxException {
         return di.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
