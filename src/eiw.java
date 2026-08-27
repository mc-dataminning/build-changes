import java.util.function.Function;

public class eiw<T> implements ein<T> {
   private final Function<gv, eiu<T>> a;

   public eiw(Function<gv, eiu<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gv $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eir<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(gv $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
