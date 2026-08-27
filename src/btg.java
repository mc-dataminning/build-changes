import java.util.Set;

public abstract class btg<E extends bjb> {
   private static final arx a = arx.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final btn d = btn.b().a(16.0);
   private static final btn e = btn.b().a(16.0).e();
   private static final btn f = btn.a().a(16.0);
   private static final btn g = btn.a().a(16.0).e();
   private static final btn h = btn.a().a(16.0).d();
   private static final btn i = btn.a().a(16.0).d().e();
   private final int j;
   private long k;

   public btg(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public btg() {
      this(20);
   }

   public final void b(akn $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(akn var1, E var2);

   public abstract Set<bsc<?>> a();

   public static boolean b(bjb $$0, bjb $$1) {
      return $$0.dM().b(bsc.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bjb $$0, bjb $$1) {
      return $$0.dM().b(bsc.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bjb $$0, bjb $$1) {
      return $$0.dM().b(bsc.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
