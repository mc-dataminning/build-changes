import java.util.Set;

public abstract class cdl<E extends btb> {
   private static final ayo a = ayo.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cds d = cds.b().a(16.0);
   private static final cds e = cds.b().a(16.0).e();
   private static final cds f = cds.a().a(16.0);
   private static final cds g = cds.a().a(16.0).e();
   private static final cds h = cds.a().a(16.0).d();
   private static final cds i = cds.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdl(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdl() {
      this(20);
   }

   public final void b(aqm $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqm var1, E var2);

   public abstract Set<ccf<?>> a();

   public static boolean b(btb $$0, btb $$1) {
      return $$0.dU().b(ccf.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btb $$0, btb $$1) {
      return $$0.dU().b(ccf.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btb $$0, btb $$1) {
      return $$0.dU().b(ccf.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
