import java.util.Set;

public abstract class bvd<E extends bky> {
   private static final ato a = ato.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bvk d = bvk.b().a(16.0);
   private static final bvk e = bvk.b().a(16.0).e();
   private static final bvk f = bvk.a().a(16.0);
   private static final bvk g = bvk.a().a(16.0).e();
   private static final bvk h = bvk.a().a(16.0).d();
   private static final bvk i = bvk.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bvd(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bvd() {
      this(20);
   }

   public final void b(ama $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(ama var1, E var2);

   public abstract Set<btz<?>> a();

   public static boolean b(bky $$0, bky $$1) {
      return $$0.dN().b(btz.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bky $$0, bky $$1) {
      return $$0.dN().b(btz.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bky $$0, bky $$1) {
      return $$0.dN().b(btz.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
