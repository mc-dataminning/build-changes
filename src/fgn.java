import java.util.function.Function;

public class fgn<T> implements fge<T> {
   private final Function<iu, fgl<T>> a;

   public fgn(Function<iu, fgl<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fgi<T> $$0) {
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
