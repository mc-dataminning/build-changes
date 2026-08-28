import java.util.function.Function;

public class fhp<T> implements fhg<T> {
   private final Function<iw, fhn<T>> a;

   public fhp(Function<iw, fhn<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iw $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fhk<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iw $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
