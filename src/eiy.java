import java.util.function.Function;

public class eiy<T> implements eip<T> {
   private final Function<gw, eiw<T>> a;

   public eiy(Function<gw, eiw<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eit<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(gw $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
