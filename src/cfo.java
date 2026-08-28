import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public abstract class cfo<E extends bve> {
   private static final azv a = azv.b();
   private static final int b = 20;
   private static final int c = 16;
   private static final cfv d = cfv.b().a(16.0);
   private static final cfv e = cfv.b().a(16.0).e();
   private static final cfv f = cfv.a().a(16.0);
   private static final cfv g = cfv.a().a(16.0).e();
   private static final cfv h = cfv.a().a(16.0).d();
   private static final cfv i = cfv.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cfo(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cfo() {
      this(20);
   }

   public final void b(arq $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$1);
         this.a($$0, $$1);
      }
   }

   private void a(E $$0) {
      double $$1 = $$0.h(bwm.m);
      d.a($$1);
      e.a($$1);
      f.a($$1);
      g.a($$1);
      h.a($$1);
      i.a($$1);
   }

   protected abstract void a(arq var1, E var2);

   public abstract Set<cei<?>> a();

   public static boolean b(bve $$0, bve $$1) {
      return $$0.ee().b(cei.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bve $$0, bve $$1) {
      return $$0.ee().b(cei.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static Predicate<bve> a(bve $$0, int $$1) {
      return a($$1, $$1x -> c($$0, $$1x));
   }

   public static boolean d(bve $$0, bve $$1) {
      return $$0.ee().b(cei.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
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
