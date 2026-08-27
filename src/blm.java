import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.Optional;

public abstract class blm<C, V> implements blg<StringReader, V>, bln {
   private final bla<akh> b;
   protected final C a;

   protected blm(bla<akh> $$0, C $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public Optional<V> a(blf<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();
      Optional<akh> $$2 = $$0.b(this.b);
      if ($$2.isPresent()) {
         try {
            return Optional.of(this.a((ImmutableStringReader)$$0.b(), $$2.get()));
         } catch (Exception var5) {
            $$0.a().a($$1, this, var5);
            return Optional.empty();
         }
      } else {
         $$0.a().a($$1, this, akh.c.createWithContext((ImmutableStringReader)$$0.b()));
         return Optional.empty();
      }
   }

   protected abstract V a(ImmutableStringReader var1, akh var2) throws Exception;
}
