import java.util.Set;

public abstract class byr<E extends boi> {
   private static final awp a = awp.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final byy d = byy.b().a(16.0);
   private static final byy e = byy.b().a(16.0).e();
   private static final byy f = byy.a().a(16.0);
   private static final byy g = byy.a().a(16.0).e();
   private static final byy h = byy.a().a(16.0).d();
   private static final byy i = byy.a().a(16.0).d().e();
   private final int j;
   private long k;

   public byr(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public byr() {
      this(20);
   }

   public final void b(aow $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aow var1, E var2);

   public abstract Set<bxl<?>> a();

   public static boolean b(boi $$0, boi $$1) {
      return $$0.dO().b(bxl.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(boi $$0, boi $$1) {
      return $$0.dO().b(bxl.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(boi $$0, boi $$1) {
      return $$0.dO().b(bxl.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
