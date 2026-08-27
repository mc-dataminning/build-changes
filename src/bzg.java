import java.util.Set;

public abstract class bzg<E extends box> {
   private static final awt a = awt.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bzn d = bzn.b().a(16.0);
   private static final bzn e = bzn.b().a(16.0).e();
   private static final bzn f = bzn.a().a(16.0);
   private static final bzn g = bzn.a().a(16.0).e();
   private static final bzn h = bzn.a().a(16.0).d();
   private static final bzn i = bzn.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bzg(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bzg() {
      this(20);
   }

   public final void b(apa $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(apa var1, E var2);

   public abstract Set<bya<?>> a();

   public static boolean b(box $$0, box $$1) {
      return $$0.dM().b(bya.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(box $$0, box $$1) {
      return $$0.dM().b(bya.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(box $$0, box $$1) {
      return $$0.dM().b(bya.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
