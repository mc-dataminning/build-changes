import java.util.Set;

public abstract class bqf<E extends bfz> {
   private static final apf a = apf.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bqm d = bqm.b().a(16.0);
   private static final bqm e = bqm.b().a(16.0).e();
   private static final bqm f = bqm.a().a(16.0);
   private static final bqm g = bqm.a().a(16.0).e();
   private static final bqm h = bqm.a().a(16.0).d();
   private static final bqm i = bqm.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bqf(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bqf() {
      this(20);
   }

   public final void b(aif $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(aif var1, E var2);

   public abstract Set<bpb<?>> a();

   public static boolean b(bfz $$0, bfz $$1) {
      return $$0.dK().b(bpb.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bfz $$0, bfz $$1) {
      return $$0.dK().b(bpb.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bfz $$0, bfz $$1) {
      return $$0.dK().b(bpb.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
