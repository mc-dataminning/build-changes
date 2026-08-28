import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.Optional;

public abstract class bmv<C, V> implements bmp<StringReader, V>, bmw {
   private final bmj<alf> b;
   protected final C a;

   protected bmv(bmj<alf> $$0, C $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public Optional<V> a(bmo<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();
      Optional<alf> $$2 = $$0.b(this.b);
      if ($$2.isPresent()) {
         try {
            return Optional.of(this.a((ImmutableStringReader)$$0.b(), $$2.get()));
         } catch (Exception var5) {
            $$0.a().a($$1, this, var5);
            return Optional.empty();
         }
      } else {
         $$0.a().a($$1, this, alf.c.createWithContext((ImmutableStringReader)$$0.b()));
         return Optional.empty();
      }
   }

   protected abstract V a(ImmutableStringReader var1, alf var2) throws Exception;
}
