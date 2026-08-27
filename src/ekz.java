import java.util.function.Function;

public class ekz<T> implements ekq<T> {
   private final Function<ht, ekx<T>> a;

   public ekz(Function<ht, ekx<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eku<T> $$0) {
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
