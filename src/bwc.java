import java.util.Set;

public abstract class bwc<E extends blv> {
   private static final auf a = auf.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bwj d = bwj.b().a(16.0);
   private static final bwj e = bwj.b().a(16.0).e();
   private static final bwj f = bwj.a().a(16.0);
   private static final bwj g = bwj.a().a(16.0).e();
   private static final bwj h = bwj.a().a(16.0).d();
   private static final bwj i = bwj.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bwc(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bwc() {
      this(20);
   }

   public final void b(amp $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(amp var1, E var2);

   public abstract Set<bux<?>> a();

   public static boolean b(blv $$0, blv $$1) {
      return $$0.dO().b(bux.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(blv $$0, blv $$1) {
      return $$0.dO().b(bux.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(blv $$0, blv $$1) {
      return $$0.dO().b(bux.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
