import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface buk extends bui, Iterable<czy> {
   float p_ = 4.0F;

   int b();

   boolean c();

   czy a(int var1);

   czy a(int var1, int var2);

   czy b(int var1);

   void a(int var1, czy var2);

   default int ao_() {
      return 99;
   }

   default int f_(czy $$0) {
      return Math.min(this.ao_(), $$0.k());
   }

   void e();

   boolean a(crx var1);

   default void c_(crx $$0) {
   }

   default void c(crx $$0) {
   }

   default boolean b(int $$0, czy $$1) {
      return true;
   }

   default boolean a(buk $$0, int $$1, czy $$2) {
      return true;
   }

   default int a_(czu $$0) {
      int $$1 = 0;

      for (czy $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<czu> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<czy> $$0) {
      for (czy $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dyc $$0, crx $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dyc $$0, crx $$1, float $$2) {
      djx $$3 = $$0.i();
      iv $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<czy> iterator() {
      return new buk.a(this);
   }

   public static class a implements Iterator<czy> {
      private final buk a;
      private int b;
      private final int c;

      public a(buk $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public czy a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
