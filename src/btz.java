import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface btz extends btx, Iterable<czn> {
   float r_ = 4.0F;

   int b();

   boolean c();

   czn a(int var1);

   czn a(int var1, int var2);

   czn b(int var1);

   void a(int var1, czn var2);

   default int ak_() {
      return 99;
   }

   default int f_(czn $$0) {
      return Math.min(this.ak_(), $$0.k());
   }

   void e();

   boolean a(crm var1);

   default void c_(crm $$0) {
   }

   default void c(crm $$0) {
   }

   default boolean b(int $$0, czn $$1) {
      return true;
   }

   default boolean a(btz $$0, int $$1, czn $$2) {
      return true;
   }

   default int a_(czj $$0) {
      int $$1 = 0;

      for (czn $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<czj> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<czn> $$0) {
      for (czn $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dxr $$0, crm $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dxr $$0, crm $$1, float $$2) {
      djm $$3 = $$0.i();
      iv $$4 = $$0.ax_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<czn> iterator() {
      return new btz.a(this);
   }

   public static class a implements Iterator<czn> {
      private final btz a;
      private int b;
      private final int c;

      public a(btz $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public czn a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
