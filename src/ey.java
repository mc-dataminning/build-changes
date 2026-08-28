import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface ey<T extends ey<T>> {
   boolean c(int var1);

   T b(et var1);

   et p();

   default T a_() {
      return this.b(et.a);
   }

   CommandDispatcher<T> x();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable hz var4);

   boolean y();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable hz $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends ey<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((ey)$$0.getSource()).p().onResult($$1, $$2);
   }
}
