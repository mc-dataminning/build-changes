import java.util.Set;

public abstract class btc<E extends biw> {
   private static final art a = art.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final btj d = btj.b().a(16.0);
   private static final btj e = btj.b().a(16.0).e();
   private static final btj f = btj.a().a(16.0);
   private static final btj g = btj.a().a(16.0).e();
   private static final btj h = btj.a().a(16.0).d();
   private static final btj i = btj.a().a(16.0).d().e();
   private final int j;
   private long k;

   public btc(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public btc() {
      this(20);
   }

   public final void b(aki $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aki var1, E var2);

   public abstract Set<bry<?>> a();

   public static boolean b(biw $$0, biw $$1) {
      return $$0.dM().b(bry.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(biw $$0, biw $$1) {
      return $$0.dM().b(bry.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(biw $$0, biw $$1) {
      return $$0.dM().b(bry.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
