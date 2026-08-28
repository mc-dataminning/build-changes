import java.util.function.Function;

public class eyy<T> implements eyp<T> {
   private final Function<jd, eyw<T>> a;

   public eyy(Function<jd, eyw<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eyt<T> $$0) {
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
