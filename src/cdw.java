import java.util.Set;

public abstract class cdw<E extends btl> {
   private static final ayv a = ayv.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final ced d = ced.b().a(16.0);
   private static final ced e = ced.b().a(16.0).e();
   private static final ced f = ced.a().a(16.0);
   private static final ced g = ced.a().a(16.0).e();
   private static final ced h = ced.a().a(16.0).d();
   private static final ced i = ced.a().a(16.0).d().e();
   private final int j;
   private long k;

   public cdw(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public cdw() {
      this(20);
   }

   public final void b(aqt $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqt var1, E var2);

   public abstract Set<ccq<?>> a();

   public static boolean b(btl $$0, btl $$1) {
      return $$0.dU().b(ccq.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btl $$0, btl $$1) {
      return $$0.dU().b(ccq.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btl $$0, btl $$1) {
      return $$0.dU().b(ccq.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
