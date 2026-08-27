import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface dw<T extends dw<T>> {
   boolean c(int var1);

   T b(dq var1);

   dq p();

   default T a_() {
      return this.b(dq.a);
   }

   CommandDispatcher<T> x();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable gr var4);

   boolean y();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable gr $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends dw<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((dw)$$0.getSource()).p().onResult($$1, $$2);
   }
}
