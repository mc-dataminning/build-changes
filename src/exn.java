import java.util.function.Function;

public class exn<T> implements exe<T> {
   private final Function<iz, exl<T>> a;

   public exn(Function<iz, exl<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exi<T> $$0) {
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
