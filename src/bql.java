import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public abstract class bql<C, V> implements bqa<StringReader, V>, bqm {
   private final bpy<StringReader, ali> b;
   protected final C a;
   private final bpu<CommandSyntaxException> c;

   protected bql(bpy<StringReader, ali> $$0, C $$1) {
      this.b = $$0;
      this.a = $$1;
      this.c = bpu.a(ali.c);
   }

   @Nullable
   @Override
   public V a(bpz<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();
      ali $$2 = $$0.a(this.b);
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

   protected abstract V a(ImmutableStringReader var1, ali var2) throws Exception;
}
