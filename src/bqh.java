import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public record bqh<T>(bpx<StringReader> a, bqa<StringReader, T> b) implements bqg<T> {
   public bqh(bpx<StringReader> a, bqa<StringReader, T> b) {
      a.a();
      this.a = a;
      this.b = b;
   }

   public Optional<T> a(bqb<StringReader> $$0) {
      return $$0.b(this.b);
   }

   @Override
   public T a(StringReader $$0) throws CommandSyntaxException {
      bpy.a<StringReader> $$1 = new bpy.a<>();
      bqp $$2 = new bqp($$1, $$0);
      Optional<T> $$3 = this.a($$2);
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         List<bpz<StringReader>> $$4 = $$1.a();
         List<Exception> $$5 = $$4.stream().<Exception>mapMulti(($$1x, $$2x) -> {
            if ($$1x.c() instanceof bpw<?> $$4x) {
               $$2x.accept($$4x.create($$0.getString(), $$1x.a()));
            } else if ($$1x.c() instanceof Exception $$6x) {
               $$2x.accept($$6x);
            }
         }).toList();

         for (Exception $$6 : $$5) {
            if ($$6 instanceof CommandSyntaxException $$7) {
               throw $$7;
            }
         }

         if ($$5.size() == 1 && $$5.get(0) instanceof RuntimeException $$8) {
            throw $$8;
         } else {
            throw new IllegalStateException("Failed to parse: " + $$4.stream().map(bpz::toString).collect(Collectors.joining(", ")));
         }
      }
   }

   @Override
   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      bpy.a<StringReader> $$2 = new bpy.a<>();
      bqp $$3 = new bqp($$2, $$1);
      this.a($$3);
      List<bpz<StringReader>> $$4 = $$2.a();
      if ($$4.isEmpty()) {
         return $$0.buildFuture();
      } else {
         SuggestionsBuilder $$5 = $$0.createOffset($$2.b());

         for (bpz<StringReader> $$6 : $$4) {
            if ($$6.b() instanceof bqo $$7) {
               ep.a($$7.a(), $$5);
            } else {
               ep.b($$6.b().possibleValues($$3), $$5);
            }
         }

         return $$5.buildFuture();
      }
   }
}
