import java.util.function.Function;

public class eny<T> implements enp<T> {
   private final Function<hx, enw<T>> a;

   public eny(Function<hx, enw<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(ent<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(hx $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
