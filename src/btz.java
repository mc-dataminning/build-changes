import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface btz extends btx, Iterable<czk> {
   float r_ = 4.0F;

   int b();

   boolean c();

   czk a(int var1);

   czk a(int var1, int var2);

   czk b(int var1);

   void a(int var1, czk var2);

   default int ak_() {
      return 99;
   }

   default int f_(czk $$0) {
      return Math.min(this.ak_(), $$0.k());
   }

   void e();

   boolean a(crj var1);

   default void c_(crj $$0) {
   }

   default void c(crj $$0) {
   }

   default boolean b(int $$0, czk $$1) {
      return true;
   }

   default boolean a(btz $$0, int $$1, czk $$2) {
      return true;
   }

   default int a_(czg $$0) {
      int $$1 = 0;

      for (czk $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<czg> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<czk> $$0) {
      for (czk $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dxm $$0, crj $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dxm $$0, crj $$1, float $$2) {
      djh $$3 = $$0.i();
      iv $$4 = $$0.ax_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<czk> iterator() {
      return new btz.a(this);
   }

   public static class a implements Iterator<czk> {
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

      public czk a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
