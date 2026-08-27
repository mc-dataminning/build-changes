import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;

public interface dw<T extends dw<T>> {
   boolean c(int var1);

   void a(boolean var1, int var2);

   void d(int var1);

   T b(IntConsumer var1);

   T b(dq<T> var1);

   T y();

   CommandDispatcher<T> x();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable gp var4);

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable gp $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends dw<T>> ResultConsumer<T> a_() {
      return ($$0, $$1, $$2) -> ((dw)$$0.getSource()).a($$1, $$2);
   }
}
