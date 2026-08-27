import java.util.Set;

public abstract class bvl<E extends blg> {
   private static final ats a = ats.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bvs d = bvs.b().a(16.0);
   private static final bvs e = bvs.b().a(16.0).e();
   private static final bvs f = bvs.a().a(16.0);
   private static final bvs g = bvs.a().a(16.0).e();
   private static final bvs h = bvs.a().a(16.0).d();
   private static final bvs i = bvs.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bvl(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bvl() {
      this(20);
   }

   public final void b(ame $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(ame var1, E var2);

   public abstract Set<buh<?>> a();

   public static boolean b(blg $$0, blg $$1) {
      return $$0.dP().b(buh.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(blg $$0, blg $$1) {
      return $$0.dP().b(buh.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(blg $$0, blg $$1) {
      return $$0.dP().b(buh.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
