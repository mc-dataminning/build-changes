import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ef implements ArgumentType<cpu> {
   private static final Collection<String> a = Stream.of(cpu.a, cpu.b).map(cpu::b).collect(Collectors.toList());
   private static final cpu[] b = cpu.values();
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tn.a("argument.gamemode.invalid", $$0));

   public cpu a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      cpu $$2 = cpu.a($$1, null);
      if ($$2 == null) {
         throw c.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw ? dw.b(Arrays.stream(b).map(cpu::b), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ef a() {
      return new ef();
   }

   public static cpu a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return (cpu)$$0.getArgument($$1, cpu.class);
   }
}
