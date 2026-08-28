import java.util.Set;

public abstract class cea<E extends btq> {
   private static final azh a = azh.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final ceh d = ceh.b().a(16.0);
   private static final ceh e = ceh.b().a(16.0).e();
   private static final ceh f = ceh.a().a(16.0);
   private static final ceh g = ceh.a().a(16.0).e();
   private static final ceh h = ceh.a().a(16.0).d();
   private static final ceh i = ceh.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cea(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cea() {
      this(20);
   }

   public final void b(arf $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(arf var1, E var2);

   public abstract Set<ccu<?>> a();

   public static boolean b(btq $$0, btq $$1) {
      return $$0.dS().b(ccu.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btq $$0, btq $$1) {
      return $$0.dS().b(ccu.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btq $$0, btq $$1) {
      return $$0.dS().b(ccu.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
