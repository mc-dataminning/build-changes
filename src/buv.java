import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface buv extends but, Iterable<dak> {
   float p_ = 4.0F;

   int b();

   boolean c();

   dak a(int var1);

   dak a(int var1, int var2);

   dak b(int var1);

   void a(int var1, dak var2);

   default int ap_() {
      return 99;
   }

   default int f_(dak $$0) {
      return Math.min(this.ap_(), $$0.k());
   }

   void e();

   boolean a(csi var1);

   default void c_(csi $$0) {
   }

   default void c(csi $$0) {
   }

   default boolean b(int $$0, dak $$1) {
      return true;
   }

   default boolean a(buv $$0, int $$1, dak $$2) {
      return true;
   }

   default int a_(dag $$0) {
      int $$1 = 0;

      for (dak $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<dag> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<dak> $$0) {
      for (dak $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dyo $$0, csi $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dyo $$0, csi $$1, float $$2) {
      dkj $$3 = $$0.i();
      iw $$4 = $$0.aC_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<dak> iterator() {
      return new buv.a(this);
   }

   public static class a implements Iterator<dak> {
      private final buv a;
      private int b;
      private final int c;

      public a(buv $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public dak a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
