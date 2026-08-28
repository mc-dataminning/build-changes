import java.util.List;
import java.util.function.Predicate;

public class dvf<T> implements dvo<T> {
   private final jr<T> a;

   public dvf(jr<T> $$0) {
      this.a = $$0;
   }

   public static <A> dvo<A> a(int $$0, jr<A> $$1, dvp<A> $$2, List<A> $$3) {
      return new dvf<>($$1);
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
         throw new dvn($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vw $$0) {
   }

   @Override
   public void b(vw $$0) {
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
   public dvo<T> c() {
      return this;
   }
}
