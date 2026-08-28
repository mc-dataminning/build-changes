import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public record bmu<T>(bmm<StringReader> a, bmk<T> b) {
   public Optional<T> a(bmp<StringReader> $$0) {
      return $$0.a(this.b);
   }

   public T a(StringReader $$0) throws CommandSyntaxException {
      bmn.a<StringReader> $$1 = new bmn.a<>();
      bmy $$2 = new bmy(this.a(), $$1, $$0);
      Optional<T> $$3 = this.a($$2);
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         List<Exception> $$4 = $$1.a().stream().<Exception>mapMulti(($$0x, $$1x) -> {
            if ($$0x.c() instanceof Exception $$3x) {
               $$1x.accept($$3x);
            }
         }).toList();

         for (Exception $$5 : $$4) {
            if ($$5 instanceof CommandSyntaxException $$6) {
               throw $$6;
            }
         }

         if ($$4.size() == 1 && $$4.get(0) instanceof RuntimeException $$7) {
            throw $$7;
         } else {
            throw new IllegalStateException("Failed to parse: " + $$1.a().stream().map(bmo::toString).collect(Collectors.joining(", ")));
         }
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      bmn.a<StringReader> $$2 = new bmn.a<>();
      bmy $$3 = new bmy(this.a(), $$2, $$1);
      this.a($$3);
      List<bmo<StringReader>> $$4 = $$2.a();
      if ($$4.isEmpty()) {
         return $$0.buildFuture();
      } else {
         SuggestionsBuilder $$5 = $$0.createOffset($$2.b());

         for (bmo<StringReader> $$6 : $$4) {
            if ($$6.b() instanceof bmx $$7) {
               eu.a($$7.a(), $$5);
            } else {
               eu.b($$6.b().possibleValues($$3), $$5);
            }
         }

         return $$5.buildFuture();
      }
   }
}
