import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public abstract class cff<E extends buv> {
   private static final azr a = azr.b();
   private static final int b = 20;
   private static final int c = 16;
   private static final cfm d = cfm.b().a(16.0);
   private static final cfm e = cfm.b().a(16.0).e();
   private static final cfm f = cfm.a().a(16.0);
   private static final cfm g = cfm.a().a(16.0).e();
   private static final cfm h = cfm.a().a(16.0).d();
   private static final cfm i = cfm.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cff(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cff() {
      this(20);
   }

   public final void b(arm $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$1);
         this.a($$0, $$1);
      }
   }

   private void a(E $$0) {
      double $$1 = $$0.h(bwd.m);
      d.a($$1);
      e.a($$1);
      f.a($$1);
      g.a($$1);
      h.a($$1);
      i.a($$1);
   }

   protected abstract void a(arm var1, E var2);

   public abstract Set<cdz<?>> a();

   public static boolean b(buv $$0, buv $$1) {
      return $$0.ed().b(cdz.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(buv $$0, buv $$1) {
      return $$0.ed().b(cdz.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static Predicate<buv> a(buv $$0, int $$1) {
      return a($$1, $$1x -> c($$0, $$1x));
   }

   public static boolean d(buv $$0, buv $$1) {
      return $$0.ed().b(cdz.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
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
