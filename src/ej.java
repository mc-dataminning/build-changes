import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ej implements ArgumentType<ej.a> {
   private static final Collection<String> c = Arrays.asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.angle.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.angle.invalid"));

   public static ej a() {
      return new ej();
   }

   public static float a(CommandContext<ed> $$0, String $$1) {
      return ((ej.a)$$0.getArgument($$1, ej.a.class)).a((ed)$$0.getSource());
   }

   public ej.a a(StringReader $$0) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         boolean $$1 = gh.b($$0);
         float $$2 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readFloat() : 0.0F;
         if (!Float.isNaN($$2) && !Float.isInfinite($$2)) {
            return new ej.a($$2, $$1);
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

      public float a(ed $$0) {
         return axz.g(this.b ? this.a + $$0.k().j : this.a);
      }
   }
}
