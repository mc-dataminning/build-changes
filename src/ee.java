import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface ee<T extends ee<T>> {
   boolean c(int var1);

   T b(dz var1);

   dz p();

   default T a_() {
      return this.b(dz.a);
   }

   CommandDispatcher<T> x();

   void a(CommandExceptionType var1, Message var2, boolean var3, @Nullable he var4);

   boolean y();

   default void a(CommandSyntaxException $$0, boolean $$1, @Nullable he $$2) {
      this.a($$0.getType(), $$0.getRawMessage(), $$1, $$2);
   }

   static <T extends ee<T>> ResultConsumer<T> b_() {
      return ($$0, $$1, $$2) -> ((ee)$$0.getSource()).p().onResult($$1, $$2);
   }
}
