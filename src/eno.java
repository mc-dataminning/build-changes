import java.util.function.Function;

public class eno<T> implements enf<T> {
   private final Function<hx, enm<T>> a;

   public eno(Function<hx, enm<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(enj<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(hx $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
