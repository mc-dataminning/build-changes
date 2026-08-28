import java.util.function.Function;

public class faa<T> implements ezr<T> {
   private final Function<je, ezy<T>> a;

   public faa(Function<je, ezy<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(je $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(ezv<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(je $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
