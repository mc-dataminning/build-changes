import java.util.Set;

public abstract class byn<E extends bog> {
   private static final awo a = awo.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final byu d = byu.b().a(16.0);
   private static final byu e = byu.b().a(16.0).e();
   private static final byu f = byu.a().a(16.0);
   private static final byu g = byu.a().a(16.0).e();
   private static final byu h = byu.a().a(16.0).d();
   private static final byu i = byu.a().a(16.0).d().e();
   private final int j;
   private long k;

   public byn(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public byn() {
      this(20);
   }

   public final void b(aov $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aov var1, E var2);

   public abstract Set<bxh<?>> a();

   public static boolean b(bog $$0, bog $$1) {
      return $$0.dO().b(bxh.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bog $$0, bog $$1) {
      return $$0.dO().b(bxh.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bog $$0, bog $$1) {
      return $$0.dO().b(bxh.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
