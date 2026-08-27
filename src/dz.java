import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class dz implements ArgumentType<qr> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private dz() {
   }

   public static dz a() {
      return new dz();
   }

   public static <S> qr a(CommandContext<S> $$0, String $$1) {
      return (qr)$$0.getArgument($$1, qr.class);
   }

   public qr a(StringReader $$0) throws CommandSyntaxException {
      return new rl($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
