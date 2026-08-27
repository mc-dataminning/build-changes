import java.util.function.Function;

public class evb<T> implements eus<T> {
   private final Function<im, euz<T>> a;

   public evb(Function<im, euz<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(im $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(euw<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(im $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
