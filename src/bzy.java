import java.util.Set;

public abstract class bzy<E extends bpp> {
   private static final axd a = axd.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final caf d = caf.b().a(16.0);
   private static final caf e = caf.b().a(16.0).e();
   private static final caf f = caf.a().a(16.0);
   private static final caf g = caf.a().a(16.0).e();
   private static final caf h = caf.a().a(16.0).d();
   private static final caf i = caf.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bzy(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bzy() {
      this(20);
   }

   public final void b(apf $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(apf var1, E var2);

   public abstract Set<bys<?>> a();

   public static boolean b(bpp $$0, bpp $$1) {
      return $$0.dP().b(bys.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bpp $$0, bpp $$1) {
      return $$0.dP().b(bys.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bpp $$0, bpp $$1) {
      return $$0.dP().b(bys.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
