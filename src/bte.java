import java.util.Set;

public abstract class bte<E extends biy> {
   private static final aru a = aru.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final btl d = btl.b().a(16.0);
   private static final btl e = btl.b().a(16.0).e();
   private static final btl f = btl.a().a(16.0);
   private static final btl g = btl.a().a(16.0).e();
   private static final btl h = btl.a().a(16.0).d();
   private static final btl i = btl.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bte(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bte() {
      this(20);
   }

   public final void b(akk $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(akk var1, E var2);

   public abstract Set<bsa<?>> a();

   public static boolean b(biy $$0, biy $$1) {
      return $$0.dM().b(bsa.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(biy $$0, biy $$1) {
      return $$0.dM().b(bsa.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(biy $$0, biy $$1) {
      return $$0.dM().b(bsa.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
