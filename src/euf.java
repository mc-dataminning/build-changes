import java.util.function.Function;

public class euf<T> implements etw<T> {
   private final Function<id, eud<T>> a;

   public euf(Function<id, eud<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(id $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(eua<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(id $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
