import java.util.Set;

public abstract class cdu<E extends btk> {
   private static final azc a = azc.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final ceb d = ceb.b().a(16.0);
   private static final ceb e = ceb.b().a(16.0).e();
   private static final ceb f = ceb.a().a(16.0);
   private static final ceb g = ceb.a().a(16.0).e();
   private static final ceb h = ceb.a().a(16.0).d();
   private static final ceb i = ceb.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdu(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdu() {
      this(20);
   }

   public final void b(arb $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(arb var1, E var2);

   public abstract Set<cco<?>> a();

   public static boolean b(btk $$0, btk $$1) {
      return $$0.dS().b(cco.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btk $$0, btk $$1) {
      return $$0.dS().b(cco.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btk $$0, btk $$1) {
      return $$0.dS().b(cco.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
