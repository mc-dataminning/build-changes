import java.util.List;
import java.util.function.Predicate;

public class dlk<T> implements dlt<T> {
   private final im<T> a;

   public dlk(im<T> $$0) {
      this.a = $$0;
   }

   public static <A> dlt<A> a(int $$0, im<A> $$1, dlu<A> $$2, List<A> $$3) {
      return new dlk<>($$1);
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
         throw new dls($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ui $$0) {
   }

   @Override
   public void b(ui $$0) {
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
   public dlt<T> c() {
      return this;
   }
}
