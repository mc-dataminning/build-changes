import java.util.function.Function;

public class ejw<T> implements ejn<T> {
   private final Function<ht, eju<T>> a;

   public ejw(Function<ht, eju<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(ejr<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ht $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
