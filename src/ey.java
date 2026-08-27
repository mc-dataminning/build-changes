import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ey<T extends Enum<T> & asf> implements ArgumentType<T> {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> te.a("argument.enum.invalid", $$0));
   private final Codec<T> b;
   private final Supplier<T[]> c;

   protected ey(Codec<T> $$0, Supplier<T[]> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public T a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      return (T)this.b.parse(JsonOps.INSTANCE, new JsonPrimitive($$1)).result().orElseThrow(() -> a.create($$1));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dv.b(Arrays.<Enum>stream((Enum[])this.c.get()).map($$0x -> ((asf)$$0x).c()).map(this::a).collect(Collectors.toList()), $$1);
   }

   public Collection<String> getExamples() {
      return Arrays.<Enum>stream((Enum[])this.c.get()).map($$0 -> ((asf)$$0).c()).map(this::a).limit(2L).collect(Collectors.toList());
   }

   protected String a(String $$0) {
      return $$0;
   }
}
