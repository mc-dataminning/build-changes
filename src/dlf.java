import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class dlf<T> implements dln<T> {
   private final im<T> a;
   private final atf<T> b;
   private final dlo<T> c;
   private final int d;

   public dlf(im<T> $$0, int $$1, dlo<T> $$2, List<T> $$3) {
      this($$0, $$1, $$2);
      $$3.forEach(this.b::c);
   }

   public dlf(im<T> $$0, int $$1, dlo<T> $$2) {
      this($$0, $$1, $$2, atf.c(1 << $$1));
   }

   private dlf(im<T> $$0, int $$1, dlo<T> $$2, atf<T> $$3) {
      this.a = $$0;
      this.d = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   public static <A> dln<A> a(int $$0, im<A> $$1, dlo<A> $$2, List<A> $$3) {
      return new dlf<>($$1, $$0, $$2, $$3);
   }

   @Override
   public int a(T $$0) {
      int $$1 = this.b.a($$0);
      if ($$1 == -1) {
         $$1 = this.b.c($$0);
         if ($$1 >= 1 << this.d) {
            $$1 = this.c.onResize(this.d + 1, $$0);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         if ($$0.test(this.b.a($$1))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T a(int $$0) {
      T $$1 = this.b.a($$0);
      if ($$1 == null) {
         throw new dlm($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(ug $$0) {
      this.b.a();
      int $$1 = $$0.n();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.b.c(this.a.b($$0.n()));
      }
   }

   @Override
   public void b(ug $$0) {
      int $$1 = this.b();
      $$0.c($$1);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         $$0.c(this.a.a(this.b.a($$2)));
      }
   }

   @Override
   public int a() {
      int $$0 = uu.a(this.b());

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         $$0 += uu.a(this.a.a(this.b.a($$1)));
      }

      return $$0;
   }

   public List<T> d() {
      ArrayList<T> $$0 = new ArrayList<>();
      this.b.iterator().forEachRemaining($$0::add);
      return $$0;
   }

   @Override
   public int b() {
      return this.b.b();
   }

   @Override
   public dln<T> c() {
      return new dlf<>(this.a, this.d, this.c, this.b.c());
   }
}
