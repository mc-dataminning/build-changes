import java.util.Set;

public abstract class bvq<E extends bll> {
   private static final atw a = atw.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bvx d = bvx.b().a(16.0);
   private static final bvx e = bvx.b().a(16.0).e();
   private static final bvx f = bvx.a().a(16.0);
   private static final bvx g = bvx.a().a(16.0).e();
   private static final bvx h = bvx.a().a(16.0).d();
   private static final bvx i = bvx.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bvq(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bvq() {
      this(20);
   }

   public final void b(ami $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(ami var1, E var2);

   public abstract Set<bum<?>> a();

   public static boolean b(bll $$0, bll $$1) {
      return $$0.dP().b(bum.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bll $$0, bll $$1) {
      return $$0.dP().b(bum.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bll $$0, bll $$1) {
      return $$0.dP().b(bum.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
