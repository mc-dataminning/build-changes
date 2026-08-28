import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface bum extends buk, Iterable<daa> {
   float p_ = 4.0F;

   int b();

   boolean c();

   daa a(int var1);

   daa a(int var1, int var2);

   daa b(int var1);

   void a(int var1, daa var2);

   default int ao_() {
      return 99;
   }

   default int f_(daa $$0) {
      return Math.min(this.ao_(), $$0.k());
   }

   void e();

   boolean a(crz var1);

   default void c_(crz $$0) {
   }

   default void c(crz $$0) {
   }

   default boolean b(int $$0, daa $$1) {
      return true;
   }

   default boolean a(bum $$0, int $$1, daa $$2) {
      return true;
   }

   default int a_(czw $$0) {
      int $$1 = 0;

      for (daa $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<czw> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<daa> $$0) {
      for (daa $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dye $$0, crz $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dye $$0, crz $$1, float $$2) {
      djz $$3 = $$0.i();
      iw $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<daa> iterator() {
      return new bum.a(this);
   }

   public static class a implements Iterator<daa> {
      private final bum a;
      private int b;
      private final int c;

      public a(bum $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public daa a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
