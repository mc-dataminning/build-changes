import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface ev<T extends ev<T>> {
   boolean c(int var1);

   T b(eq var1);

   eq p();

   default T a_() {
      return this.b(eq.a);
   }

   CommandDispatcher<T> x();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable hv var4);

   boolean y();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable hv $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends ev<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((ev)$$0.getSource()).p().onResult($$1, $$2);
   }
}
