import java.util.Set;

public abstract class bws<E extends bml> {
   private static final auv a = auv.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bwz d = bwz.b().a(16.0);
   private static final bwz e = bwz.b().a(16.0).e();
   private static final bwz f = bwz.a().a(16.0);
   private static final bwz g = bwz.a().a(16.0).e();
   private static final bwz h = bwz.a().a(16.0).d();
   private static final bwz i = bwz.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bws(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bws() {
      this(20);
   }

   public final void b(and $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(and var1, E var2);

   public abstract Set<bvn<?>> a();

   public static boolean b(bml $$0, bml $$1) {
      return $$0.dO().b(bvn.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bml $$0, bml $$1) {
      return $$0.dO().b(bvn.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bml $$0, bml $$1) {
      return $$0.dO().b(bvn.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
