import java.util.function.Function;

public class efy<T> implements efp<T> {
   private final Function<gu, efw<T>> a;

   public efy(Function<gu, efw<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eft<T> $$0) {
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
