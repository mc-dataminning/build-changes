import java.util.Set;

public abstract class ccy<E extends bso> {
   private static final ayk a = ayk.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cdf d = cdf.b().a(16.0);
   private static final cdf e = cdf.b().a(16.0).e();
   private static final cdf f = cdf.a().a(16.0);
   private static final cdf g = cdf.a().a(16.0).e();
   private static final cdf h = cdf.a().a(16.0).d();
   private static final cdf i = cdf.a().a(16.0).d().e();
   private final int j;
   private long k;

   public ccy(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public ccy() {
      this(20);
   }

   public final void b(aqm $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqm var1, E var2);

   public abstract Set<cbs<?>> a();

   public static boolean b(bso $$0, bso $$1) {
      return $$0.dS().b(cbs.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bso $$0, bso $$1) {
      return $$0.dS().b(cbs.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bso $$0, bso $$1) {
      return $$0.dS().b(cbs.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
