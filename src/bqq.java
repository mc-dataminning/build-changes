import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public record bqq<T>(bqg<StringReader> a, bqj<StringReader, T> b) implements bqp<T> {
   public bqq(bqg<StringReader> a, bqj<StringReader, T> b) {
      a.a();
      this.a = a;
      this.b = b;
   }

   public Optional<T> a(bqk<StringReader> $$0) {
      return $$0.b(this.b);
   }

   @Override
   public T a(StringReader $$0) throws CommandSyntaxException {
      bqh.a<StringReader> $$1 = new bqh.a<>();
      bqy $$2 = new bqy($$1, $$0);
      Optional<T> $$3 = this.a($$2);
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         List<bqi<StringReader>> $$4 = $$1.a();
         List<Exception> $$5 = $$4.stream().<Exception>mapMulti(($$1x, $$2x) -> {
            if ($$1x.c() instanceof bqf<?> $$4x) {
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
            throw new IllegalStateException("Failed to parse: " + $$4.stream().map(bqi::toString).collect(Collectors.joining(", ")));
         }
      }
   }

   @Override
   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      bqh.a<StringReader> $$2 = new bqh.a<>();
      bqy $$3 = new bqy($$2, $$1);
      this.a($$3);
      List<bqi<StringReader>> $$4 = $$2.a();
      if ($$4.isEmpty()) {
         return $$0.buildFuture();
      } else {
         SuggestionsBuilder $$5 = $$0.createOffset($$2.b());

         for (bqi<StringReader> $$6 : $$4) {
            if ($$6.b() instanceof bqx $$7) {
               ep.a($$7.a(), $$5);
            } else {
               ep.b($$6.b().possibleValues($$3), $$5);
            }
         }

         return $$5.buildFuture();
      }
   }
}
