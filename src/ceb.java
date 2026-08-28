import java.util.Set;

public abstract class ceb<E extends btr> {
   private static final azh a = azh.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final cei d = cei.b().a(16.0);
   private static final cei e = cei.b().a(16.0).e();
   private static final cei f = cei.a().a(16.0);
   private static final cei g = cei.a().a(16.0).e();
   private static final cei h = cei.a().a(16.0).d();
   private static final cei i = cei.a().a(16.0).d().e();
   private final int j;
   private long k;

   public ceb(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public ceb() {
      this(20);
   }

   public final void b(arf $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(arf var1, E var2);

   public abstract Set<ccv<?>> a();

   public static boolean b(btr $$0, btr $$1) {
      return $$0.dS().b(ccv.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(btr $$0, btr $$1) {
      return $$0.dS().b(ccv.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(btr $$0, btr $$1) {
      return $$0.dS().b(ccv.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
