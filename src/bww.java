import java.util.Set;

public abstract class bww<E extends bmo> {
   private static final auw a = auw.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bxd d = bxd.b().a(16.0);
   private static final bxd e = bxd.b().a(16.0).e();
   private static final bxd f = bxd.a().a(16.0);
   private static final bxd g = bxd.a().a(16.0).e();
   private static final bxd h = bxd.a().a(16.0).d();
   private static final bxd i = bxd.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bww(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bww() {
      this(20);
   }

   public final void b(ane $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(ane var1, E var2);

   public abstract Set<bvq<?>> a();

   public static boolean b(bmo $$0, bmo $$1) {
      return $$0.dN().b(bvq.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bmo $$0, bmo $$1) {
      return $$0.dN().b(bvq.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bmo $$0, bmo $$1) {
      return $$0.dN().b(bvq.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
