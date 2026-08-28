import java.util.function.Function;

public class fgu<T> implements fgl<T> {
   private final Function<iv, fgs<T>> a;

   public fgu(Function<iv, fgs<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fgp<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(iv $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
