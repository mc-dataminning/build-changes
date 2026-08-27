import java.util.Set;

public abstract class cax<E extends bqo> {
   private static final axr a = axr.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cbe d = cbe.b().a(16.0);
   private static final cbe e = cbe.b().a(16.0).e();
   private static final cbe f = cbe.a().a(16.0);
   private static final cbe g = cbe.a().a(16.0).e();
   private static final cbe h = cbe.a().a(16.0).d();
   private static final cbe i = cbe.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cax(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cax() {
      this(20);
   }

   public final void b(aps $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aps var1, E var2);

   public abstract Set<bzr<?>> a();

   public static boolean b(bqo $$0, bqo $$1) {
      return $$0.dP().b(bzr.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bqo $$0, bqo $$1) {
      return $$0.dP().b(bzr.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bqo $$0, bqo $$1) {
      return $$0.dP().b(bzr.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
