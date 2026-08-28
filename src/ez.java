import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface ez<T extends ez<T>> {
   boolean c(int var1);

   T b(eu var1);

   eu p();

   default T a_() {
      return this.b(eu.a);
   }

   CommandDispatcher<T> w();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable ib var4);

   boolean x();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable ib $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends ez<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((ez)$$0.getSource()).p().onResult($$1, $$2);
   }
}
