import java.util.Set;

public abstract class btn<E extends bji> {
   private static final ase a = ase.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final btu d = btu.b().a(16.0);
   private static final btu e = btu.b().a(16.0).e();
   private static final btu f = btu.a().a(16.0);
   private static final btu g = btu.a().a(16.0).e();
   private static final btu h = btu.a().a(16.0).d();
   private static final btu i = btu.a().a(16.0).d().e();
   private final int j;
   private long k;

   public btn(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public btn() {
      this(20);
   }

   public final void b(aks $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aks var1, E var2);

   public abstract Set<bsj<?>> a();

   public static boolean b(bji $$0, bji $$1) {
      return $$0.dN().b(bsj.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bji $$0, bji $$1) {
      return $$0.dN().b(bsj.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bji $$0, bji $$1) {
      return $$0.dN().b(bsj.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
