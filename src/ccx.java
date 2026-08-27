import java.util.Set;

public abstract class ccx<E extends bso> {
   private static final ayt a = ayt.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cde d = cde.b().a(16.0);
   private static final cde e = cde.b().a(16.0).e();
   private static final cde f = cde.a().a(16.0);
   private static final cde g = cde.a().a(16.0).e();
   private static final cde h = cde.a().a(16.0).d();
   private static final cde i = cde.a().a(16.0).d().e();
   private final int j;
   private long k;

   public ccx(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public ccx() {
      this(20);
   }

   public final void b(aqt $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aqt var1, E var2);

   public abstract Set<cbr<?>> a();

   public static boolean b(bso $$0, bso $$1) {
      return $$0.dZ().b(cbr.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bso $$0, bso $$1) {
      return $$0.dZ().b(cbr.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bso $$0, bso $$1) {
      return $$0.dZ().b(cbr.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
