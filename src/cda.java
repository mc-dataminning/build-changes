import java.util.Set;

public abstract class cda<E extends bsq> {
   private static final aym a = aym.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cdh d = cdh.b().a(16.0);
   private static final cdh e = cdh.b().a(16.0).e();
   private static final cdh f = cdh.a().a(16.0);
   private static final cdh g = cdh.a().a(16.0).e();
   private static final cdh h = cdh.a().a(16.0).d();
   private static final cdh i = cdh.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cda(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cda() {
      this(20);
   }

   public final void b(aqn $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqn var1, E var2);

   public abstract Set<cbu<?>> a();

   public static boolean b(bsq $$0, bsq $$1) {
      return $$0.dS().b(cbu.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bsq $$0, bsq $$1) {
      return $$0.dS().b(cbu.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bsq $$0, bsq $$1) {
      return $$0.dS().b(cbu.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
