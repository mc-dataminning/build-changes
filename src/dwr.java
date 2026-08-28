import java.util.List;
import java.util.function.Predicate;

public class dwr<T> implements dxa<T> {
   private final js<T> a;

   public dwr(js<T> $$0) {
      this.a = $$0;
   }

   public static <A> dxa<A> a(int $$0, js<A> $$1, dxb<A> $$2, List<A> $$3) {
      return new dwr<>($$1);
   }

   @Override
   public int a(T $$0) {
      int $$1 = this.a.a($$0);
      return $$1 == -1 ? 0 : $$1;
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      return true;
   }

   @Override
   public T a(int $$0) {
      T $$1 = this.a.a($$0);
      if ($$1 == null) {
         throw new dwz($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wa $$0) {
   }

   @Override
   public void b(wa $$0) {
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return this.a.c();
   }

   @Override
   public dxa<T> a(dxb<T> $$0) {
      return this;
   }
}
