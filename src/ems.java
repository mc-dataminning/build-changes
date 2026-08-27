import java.util.function.Function;

public class ems<T> implements emj<T> {
   private final Function<hv, emq<T>> a;

   public ems(Function<hv, emq<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hv $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(emn<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(hv $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
