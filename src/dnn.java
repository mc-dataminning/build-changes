import java.util.List;
import java.util.function.Predicate;

public class dnn<T> implements dnw<T> {
   private final io<T> a;

   public dnn(io<T> $$0) {
      this.a = $$0;
   }

   public static <A> dnw<A> a(int $$0, io<A> $$1, dnx<A> $$2, List<A> $$3) {
      return new dnn<>($$1);
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
         throw new dnv($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(uq $$0) {
   }

   @Override
   public void b(uq $$0) {
   }

   @Override
   public int a() {
      return 0;
   }

   @Override
   public int b() {
      return this.a.b();
   }

   @Override
   public dnw<T> c() {
      return this;
   }
}
