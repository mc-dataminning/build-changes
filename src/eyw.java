import java.util.function.Function;

public class eyw<T> implements eyn<T> {
   private final Function<jd, eyu<T>> a;

   public eyw(Function<jd, eyu<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eyr<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(jd $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
