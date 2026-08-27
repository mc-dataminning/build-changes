import java.util.Set;

public abstract class bzx<E extends bpo> {
   private static final axd a = axd.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cae d = cae.b().a(16.0);
   private static final cae e = cae.b().a(16.0).e();
   private static final cae f = cae.a().a(16.0);
   private static final cae g = cae.a().a(16.0).e();
   private static final cae h = cae.a().a(16.0).d();
   private static final cae i = cae.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bzx(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bzx() {
      this(20);
   }

   public final void b(apf $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(apf var1, E var2);

   public abstract Set<byr<?>> a();

   public static boolean b(bpo $$0, bpo $$1) {
      return $$0.dP().b(byr.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bpo $$0, bpo $$1) {
      return $$0.dP().b(byr.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bpo $$0, bpo $$1) {
      return $$0.dP().b(byr.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
