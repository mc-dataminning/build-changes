import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ResultConsumer;
import java.util.function.IntConsumer;

public interface dw<T extends dw<T>> {
   boolean c(int var1);

   void a(boolean var1, int var2);

   void d(int var1);

   T b(IntConsumer var1);

   T b(dq<T> var1);

   T y();

   CommandDispatcher<T> x();

   static <T extends dw<T>> ResultConsumer<T> a_() {
      return ($$0, $$1, $$2) -> ((dw)$$0.getSource()).a($$1, $$2);
   }
}
