import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public abstract class bqw<C, V> implements bql<StringReader, V>, bqx {
   private final bqj<StringReader, alr> b;
   protected final C a;
   private final bqf<CommandSyntaxException> c;

   protected bqw(bqj<StringReader, alr> $$0, C $$1) {
      this.b = $$0;
      this.a = $$1;
      this.c = bqf.a(alr.c);
   }

   @Nullable
   @Override
   public V a(bqk<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();
      alr $$2 = $$0.a(this.b);
      if ($$2 != null) {
         try {
            return this.a((ImmutableStringReader)$$0.f(), $$2);
         } catch (Exception var5) {
            $$0.b().a($$1, this, var5);
            return null;
         }
      } else {
         $$0.b().a($$1, this, this.c);
         return null;
      }
   }

   protected abstract V a(ImmutableStringReader var1, alr var2) throws Exception;
}
