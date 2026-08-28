import java.util.Set;

public abstract class cdz<E extends btp> {
   private static final azh a = azh.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final ceg d = ceg.b().a(16.0);
   private static final ceg e = ceg.b().a(16.0).e();
   private static final ceg f = ceg.a().a(16.0);
   private static final ceg g = ceg.a().a(16.0).e();
   private static final ceg h = ceg.a().a(16.0).d();
   private static final ceg i = ceg.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdz(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdz() {
      this(20);
   }

   public final void b(arf $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(arf var1, E var2);

   public abstract Set<cct<?>> a();

   public static boolean b(btp $$0, btp $$1) {
      return $$0.dS().b(cct.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btp $$0, btp $$1) {
      return $$0.dS().b(cct.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btp $$0, btp $$1) {
      return $$0.dS().b(cct.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
