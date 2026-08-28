import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface el<T extends el<T>> {
   boolean c(int var1);

   T b(eg var1);

   eg p();

   default T a_() {
      return this.b(eg.a);
   }

   CommandDispatcher<T> w();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable hn var4);

   boolean x();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable hn $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends el<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((el)$$0.getSource()).p().onResult($$1, $$2);
   }
}
