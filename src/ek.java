import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface ek<T extends ek<T>> {
   boolean c(int var1);

   T b(ef var1);

   ef p();

   default T a_() {
      return this.b(ef.a);
   }

   CommandDispatcher<T> w();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable hm var4);

   boolean x();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable hm $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends ek<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((ek)$$0.getSource()).p().onResult($$1, $$2);
   }
}
