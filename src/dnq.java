import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public class dnq<T> implements dns<T> {
   private final io<T> a;
   private final T[] b;
   private final dnt<T> c;
   private final int d;
   private int e;

   private dnq(io<T> $$0, int $$1, dnt<T> $$2, List<T> $$3) {
      this.a = $$0;
      this.b = (T[])(new Object[1 << $$1]);
      this.d = $$1;
      this.c = $$2;
      Validate.isTrue($$3.size() <= this.b.length, "Can't initialize LinearPalette of size %d with %d entries", new Object[]{this.b.length, $$3.size()});

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         this.b[$$4] = $$3.get($$4);
      }

      this.e = $$3.size();
   }

   private dnq(io<T> $$0, T[] $$1, dnt<T> $$2, int $$3, int $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static <A> dns<A> a(int $$0, io<A> $$1, dnt<A> $$2, List<A> $$3) {
      return new dnq<>($$1, $$0, $$2, $$3);
   }

   @Override
   public int a(T $$0) {
      for (int $$1 = 0; $$1 < this.e; $$1++) {
         if (this.b[$$1] == $$0) {
            return $$1;
         }
      }

      int $$2 = this.e;
      if ($$2 < this.b.length) {
         this.b[$$2] = $$0;
         this.e++;
         return $$2;
      } else {
         return this.c.onResize(this.d + 1, $$0);
      }
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      for (int $$1 = 0; $$1 < this.e; $$1++) {
         if ($$0.test(this.b[$$1])) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T a(int $$0) {
      if ($$0 >= 0 && $$0 < this.e) {
         return this.b[$$0];
      } else {
         throw new dnr($$0);
      }
   }

   @Override
   public void a(uq $$0) {
      this.e = $$0.n();

      for (int $$1 = 0; $$1 < this.e; $$1++) {
         this.b[$$1] = this.a.b($$0.n());
      }
   }

   @Override
   public void b(uq $$0) {
      $$0.c(this.e);

      for (int $$1 = 0; $$1 < this.e; $$1++) {
         $$0.c(this.a.a(this.b[$$1]));
      }
   }

   @Override
   public int a() {
      int $$0 = vh.a(this.b());

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         $$0 += vh.a(this.a.a(this.b[$$1]));
      }

      return $$0;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public dns<T> c() {
      return new dnq<>(this.a, (T[])((Object[])this.b.clone()), this.c, this.d, this.e);
   }
}
