import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ft implements ArgumentType<cxd> {
   private static final Collection<String> a = List.of("container.*", "container.5", "weapon");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("slot.unknown", $$0));

   public static ft a() {
      return new ft();
   }

   public static cxd a(CommandContext<ej> $$0, String $$1) {
      return (cxd)$$0.getArgument($$1, cxd.class);
   }

   public cxd a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = en.a($$0, $$0x -> $$0x != ' ');
      cxd $$2 = cxe.a($$1);
      if ($$2 == null) {
         throw b.createWithContext($$0, $$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eo.b(cxe.a(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
