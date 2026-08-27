import java.util.Set;

public abstract class bwm<E extends bmf> {
   private static final aup a = aup.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bwt d = bwt.b().a(16.0);
   private static final bwt e = bwt.b().a(16.0).e();
   private static final bwt f = bwt.a().a(16.0);
   private static final bwt g = bwt.a().a(16.0).e();
   private static final bwt h = bwt.a().a(16.0).d();
   private static final bwt i = bwt.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bwm(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bwm() {
      this(20);
   }

   public final void b(amz $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(amz var1, E var2);

   public abstract Set<bvh<?>> a();

   public static boolean b(bmf $$0, bmf $$1) {
      return $$0.dO().b(bvh.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bmf $$0, bmf $$1) {
      return $$0.dO().b(bvh.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bmf $$0, bmf $$1) {
      return $$0.dO().b(bvh.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
