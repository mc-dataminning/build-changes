import java.util.Set;

public abstract class cdi<E extends bsy> {
   private static final aym a = aym.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cdp d = cdp.b().a(16.0);
   private static final cdp e = cdp.b().a(16.0).e();
   private static final cdp f = cdp.a().a(16.0);
   private static final cdp g = cdp.a().a(16.0).e();
   private static final cdp h = cdp.a().a(16.0).d();
   private static final cdp i = cdp.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdi(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdi() {
      this(20);
   }

   public final void b(aqk $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqk var1, E var2);

   public abstract Set<ccc<?>> a();

   public static boolean b(bsy $$0, bsy $$1) {
      return $$0.dT().b(ccc.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bsy $$0, bsy $$1) {
      return $$0.dT().b(ccc.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bsy $$0, bsy $$1) {
      return $$0.dT().b(ccc.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
