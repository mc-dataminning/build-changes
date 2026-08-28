import java.util.List;
import java.util.function.Predicate;

public class dun<T> implements duw<T> {
   private final jo<T> a;

   public dun(jo<T> $$0) {
      this.a = $$0;
   }

   public static <A> duw<A> a(int $$0, jo<A> $$1, dux<A> $$2, List<A> $$3) {
      return new dun<>($$1);
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
         throw new duv($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(vr $$0) {
   }

   @Override
   public void b(vr $$0) {
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
   public duw<T> c() {
      return this;
   }
}
