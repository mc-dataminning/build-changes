import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface em<T extends em<T>> {
   boolean c(int var1);

   T b(eh var1);

   eh p();

   default T a_() {
      return this.b(eh.a);
   }

   CommandDispatcher<T> w();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable ho var4);

   boolean x();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable ho $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends em<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((em)$$0.getSource()).p().onResult($$1, $$2);
   }
}
