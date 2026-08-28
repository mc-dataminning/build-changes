import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fa implements ArgumentType<fa.a> {
   private static final Collection<String> c = Arrays.asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.angle.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.angle.invalid"));

   public static fa a() {
      return new fa();
   }

   public static float a(CommandContext<eu> $$0, String $$1) {
      return ((fa.a)$$0.getArgument($$1, fa.a.class)).a((eu)$$0.getSource());
   }

   public fa.a a(StringReader $$0) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         boolean $$1 = gy.b($$0);
         float $$2 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readFloat() : 0.0F;
         if (!Float.isNaN($$2) && !Float.isInfinite($$2)) {
            return new fa.a($$2, $$1);
         } else {
            throw b.createWithContext($$0);
         }
      }
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static final class a {
      private final float a;
      private final boolean b;

      a(float $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public float a(eu $$0) {
         return azf.h(this.b ? this.a + $$0.k().j : this.a);
      }
   }
}
