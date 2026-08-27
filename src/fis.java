import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fis<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fis<?> a = new fis<>(ayy.a, ($$0, $$1) -> {
   });

   private fis(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fis<?> a(String $$0) {
      return new fis<>($$0, Consumer::accept);
   }

   public static fis<?> a(ws $$0) {
      return new fis<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fis<?> a(List<ws> $$0) {
      return new fis<>($$0, ($$1, $$2) -> $$0.stream().map(ws::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fis<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
