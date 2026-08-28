import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface btw extends btu, Iterable<czd> {
   float r_ = 4.0F;

   int b();

   boolean c();

   czd a(int var1);

   czd a(int var1, int var2);

   czd b(int var1);

   void a(int var1, czd var2);

   default int ak_() {
      return 99;
   }

   default int f_(czd $$0) {
      return Math.min(this.ak_(), $$0.k());
   }

   void e();

   boolean a(crc var1);

   default void c_(crc $$0) {
   }

   default void c(crc $$0) {
   }

   default boolean b(int $$0, czd $$1) {
      return true;
   }

   default boolean a(btw $$0, int $$1, czd $$2) {
      return true;
   }

   default int a_(cyz $$0) {
      int $$1 = 0;

      for (czd $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cyz> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<czd> $$0) {
      for (czd $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dxf $$0, crc $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dxf $$0, crc $$1, float $$2) {
      dja $$3 = $$0.i();
      iu $$4 = $$0.ax_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<czd> iterator() {
      return new btw.a(this);
   }

   public static class a implements Iterator<czd> {
      private final btw a;
      private int b;
      private final int c;

      public a(btw $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public czd a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
