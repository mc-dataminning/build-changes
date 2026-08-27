import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fba<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fba<?> a = new fba<>(avr.a, ($$0, $$1) -> {
   });

   private fba(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fba<?> a(String $$0) {
      return new fba<>($$0, Consumer::accept);
   }

   public static fba<?> a(vf $$0) {
      return new fba<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fba<?> a(List<vf> $$0) {
      return new fba<>($$0, ($$1, $$2) -> $$0.stream().map(vf::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fba<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
