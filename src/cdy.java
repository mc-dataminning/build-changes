import java.util.Set;

public abstract class cdy<E extends bto> {
   private static final azg a = azg.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cef d = cef.b().a(16.0);
   private static final cef e = cef.b().a(16.0).e();
   private static final cef f = cef.a().a(16.0);
   private static final cef g = cef.a().a(16.0).e();
   private static final cef h = cef.a().a(16.0).d();
   private static final cef i = cef.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdy(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdy() {
      this(20);
   }

   public final void b(are $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(are var1, E var2);

   public abstract Set<ccs<?>> a();

   public static boolean b(bto $$0, bto $$1) {
      return $$0.dS().b(ccs.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bto $$0, bto $$1) {
      return $$0.dS().b(ccs.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bto $$0, bto $$1) {
      return $$0.dS().b(ccs.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
