import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class dw implements ArgumentType<dw.a> {
   private static final Collection<String> c = Arrays.asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.angle.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("argument.angle.invalid"));

   public static dw a() {
      return new dw();
   }

   public static float a(CommandContext<ds> $$0, String $$1) {
      return ((dw.a)$$0.getArgument($$1, dw.a.class)).a((ds)$$0.getSource());
   }

   public dw.a a(StringReader $$0) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         boolean $$1 = fr.b($$0);
         float $$2 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readFloat() : 0.0F;
         if (!Float.isNaN($$2) && !Float.isInfinite($$2)) {
            return new dw.a($$2, $$1);
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

      public float a(ds $$0) {
         return aro.g(this.b ? this.a + $$0.k().j : this.a);
      }
   }
}
