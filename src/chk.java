import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;

public abstract class chk<E extends bxc> {
   private static final azv a = azv.b();
   private static final int b = 20;
   private static final int c = 16;
   private static final chr d = chr.b().a(16.0);
   private static final chr e = chr.b().a(16.0).e();
   private static final chr f = chr.a().a(16.0);
   private static final chr g = chr.a().a(16.0).e();
   private static final chr h = chr.a().a(16.0).d();
   private static final chr i = chr.a().a(16.0).d().e();
   private final int j;
   private long k;

   public chk(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public chk() {
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
      double $$1 = $$0.h(byi.m);
      d.a($$1);
      e.a($$1);
      f.a($$1);
      g.a($$1);
      h.a($$1);
      i.a($$1);
   }

   protected abstract void a(arq var1, E var2);

   public abstract Set<cge<?>> a();

   public static boolean b(arq $$0, bxc $$1, bxc $$2) {
      return $$1.eb().b(cge.p, $$2) ? e.a($$0, $$1, $$2) : d.a($$0, $$1, $$2);
   }

   public static boolean c(arq $$0, bxc $$1, bxc $$2) {
      return $$1.eb().b(cge.p, $$2) ? g.a($$0, $$1, $$2) : f.a($$0, $$1, $$2);
   }

   public static BiPredicate<arq, bxc> a(bxc $$0, int $$1) {
      return a($$1, ($$1x, $$2) -> c($$1x, $$0, $$2));
   }

   public static boolean d(arq $$0, bxc $$1, bxc $$2) {
      return $$1.eb().b(cge.p, $$2) ? i.a($$0, $$1, $$2) : h.a($$0, $$1, $$2);
   }

   static <T, U> BiPredicate<T, U> a(int $$0, BiPredicate<T, U> $$1) {
      AtomicInteger $$2 = new AtomicInteger(0);
      return ($$3, $$4) -> {
         if ($$1.test($$3, $$4)) {
            $$2.set($$0);
            return true;
         } else {
            return $$2.decrementAndGet() >= 0;
         }
      };
   }
}
