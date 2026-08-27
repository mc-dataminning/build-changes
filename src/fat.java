import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class fat<T> {
   private final T b;
   private final BiConsumer<Consumer<String>, T> c;
   public static final fat<?> a = new fat<>(avm.a, ($$0, $$1) -> {
   });

   private fat(T $$0, BiConsumer<Consumer<String>, T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static fat<?> a(String $$0) {
      return new fat<>($$0, Consumer::accept);
   }

   public static fat<?> a(vd $$0) {
      return new fat<>($$0, ($$0x, $$1) -> $$0x.accept($$1.getString()));
   }

   public static fat<?> a(List<vd> $$0) {
      return new fat<>($$0, ($$1, $$2) -> $$0.stream().map(vd::getString).forEach($$1));
   }

   public void a(Consumer<String> $$0) {
      this.c.accept($$0, this.b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fat<?> $$1) ? false : $$1.c == this.c && $$1.b.equals(this.b);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
