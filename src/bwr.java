import java.util.Set;

public abstract class bwr<E extends bmk> {
   private static final auu a = auu.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bwy d = bwy.b().a(16.0);
   private static final bwy e = bwy.b().a(16.0).e();
   private static final bwy f = bwy.a().a(16.0);
   private static final bwy g = bwy.a().a(16.0).e();
   private static final bwy h = bwy.a().a(16.0).d();
   private static final bwy i = bwy.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bwr(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bwr() {
      this(20);
   }

   public final void b(and $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(and var1, E var2);

   public abstract Set<bvm<?>> a();

   public static boolean b(bmk $$0, bmk $$1) {
      return $$0.dO().b(bvm.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bmk $$0, bmk $$1) {
      return $$0.dO().b(bvm.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bmk $$0, bmk $$1) {
      return $$0.dO().b(bvm.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
