import java.util.function.Function;

public class evl<T> implements evc<T> {
   private final Function<in, evj<T>> a;

   public evl(Function<in, evj<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(in $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(evg<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(in $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
