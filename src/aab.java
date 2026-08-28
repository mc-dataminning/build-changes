import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface aab {
   int a = 4096;

   static <T extends xb, P extends aaa<? super T>> aab a(final aae<P> $$0, final Function<Iterable<aac<? super T>>, P> $$1, final zz<? super T> $$2) {
      return new aab() {
         @Override
         public void a(aac<?> $$0x, Consumer<aac<?>> $$1x) {
            if ($$0.a() == $$0) {
               P $$2 = (P)$$0;
               $$1.accept($$2);
               $$2.b().forEach($$1);
               $$1.accept($$2);
            } else {
               $$1.accept($$0);
            }
         }

         @Nullable
         @Override
         public aab.a a(aac<?> $$0x) {
            return $$0 == $$2 ? new aab.a() {
               private final List<aac<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public aac<?> a(aac<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((aac<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(aac<?> var1, Consumer<aac<?>> var2);

   @Nullable
   aab.a a(aac<?> var1);

   public interface a {
      @Nullable
      aac<?> a(aac<?> var1);
   }
}
