import java.util.function.Function;

public class eiu<T> implements eil<T> {
   private final Function<gu, eis<T>> a;

   public eiu(Function<gu, eis<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eip<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(gu $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
