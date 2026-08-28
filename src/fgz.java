import java.util.function.Function;

public class fgz<T> implements fgq<T> {
   private final Function<iv, fgx<T>> a;

   public fgz(Function<iv, fgx<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fgu<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iv $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
