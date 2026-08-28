import java.util.Set;

public abstract class cdx<E extends btn> {
   private static final azf a = azf.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cee d = cee.b().a(16.0);
   private static final cee e = cee.b().a(16.0).e();
   private static final cee f = cee.a().a(16.0);
   private static final cee g = cee.a().a(16.0).e();
   private static final cee h = cee.a().a(16.0).d();
   private static final cee i = cee.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdx(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdx() {
      this(20);
   }

   public final void b(are $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(are var1, E var2);

   public abstract Set<ccr<?>> a();

   public static boolean b(btn $$0, btn $$1) {
      return $$0.dS().b(ccr.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btn $$0, btn $$1) {
      return $$0.dS().b(ccr.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btn $$0, btn $$1) {
      return $$0.dS().b(ccr.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
