import java.util.function.Function;

public class fgf<T> implements ffw<T> {
   private final Function<iu, fgd<T>> a;

   public fgf(Function<iu, fgd<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fga<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iu $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
