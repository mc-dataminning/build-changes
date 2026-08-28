import java.util.function.Function;

public class exi<T> implements ewz<T> {
   private final Function<iz, exg<T>> a;

   public exi(Function<iz, exg<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exd<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iz $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
