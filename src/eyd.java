import java.util.function.Function;

public class eyd<T> implements exu<T> {
   private final Function<ja, eyb<T>> a;

   public eyd(Function<ja, eyb<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(exy<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(ja $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
