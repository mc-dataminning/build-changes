import java.util.Set;

public abstract class btl<E extends bjg> {
   private static final asc a = asc.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bts d = bts.b().a(16.0);
   private static final bts e = bts.b().a(16.0).e();
   private static final bts f = bts.a().a(16.0);
   private static final bts g = bts.a().a(16.0).e();
   private static final bts h = bts.a().a(16.0).d();
   private static final bts i = bts.a().a(16.0).d().e();
   private final int j;
   private long k;

   public btl(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public btl() {
      this(20);
   }

   public final void b(akr $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(akr var1, E var2);

   public abstract Set<bsh<?>> a();

   public static boolean b(bjg $$0, bjg $$1) {
      return $$0.dN().b(bsh.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bjg $$0, bjg $$1) {
      return $$0.dN().b(bsh.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bjg $$0, bjg $$1) {
      return $$0.dN().b(bsh.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
