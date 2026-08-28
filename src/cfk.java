import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public abstract class cfk<E extends bva> {
   private static final azs a = azs.b();
   private static final int b = 20;
   private static final int c = 16;
   private static final cfr d = cfr.b().a(16.0);
   private static final cfr e = cfr.b().a(16.0).e();
   private static final cfr f = cfr.a().a(16.0);
   private static final cfr g = cfr.a().a(16.0).e();
   private static final cfr h = cfr.a().a(16.0).d();
   private static final cfr i = cfr.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cfk(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cfk() {
      this(20);
   }

   public final void b(arn $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$1);
         this.a($$0, $$1);
      }
   }

   private void a(E $$0) {
      double $$1 = $$0.h(bwi.m);
      d.a($$1);
      e.a($$1);
      f.a($$1);
      g.a($$1);
      h.a($$1);
      i.a($$1);
   }

   protected abstract void a(arn var1, E var2);

   public abstract Set<cee<?>> a();

   public static boolean b(bva $$0, bva $$1) {
      return $$0.ed().b(cee.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bva $$0, bva $$1) {
      return $$0.ed().b(cee.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static Predicate<bva> a(bva $$0, int $$1) {
      return a($$1, $$1x -> c($$0, $$1x));
   }

   public static boolean d(bva $$0, bva $$1) {
      return $$0.ed().b(cee.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }

   static <T> Predicate<T> a(int $$0, Predicate<T> $$1) {
      AtomicInteger $$2 = new AtomicInteger(0);
      return $$3 -> {
         if ($$1.test($$3)) {
            $$2.set($$0);
            return true;
         } else {
            return $$2.decrementAndGet() >= 0;
         }
      };
   }
}
