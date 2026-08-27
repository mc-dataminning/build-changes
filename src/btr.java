import java.util.Set;

public abstract class btr<E extends bjm> {
   private static final ash a = ash.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bty d = bty.b().a(16.0);
   private static final bty e = bty.b().a(16.0).e();
   private static final bty f = bty.a().a(16.0);
   private static final bty g = bty.a().a(16.0).e();
   private static final bty h = bty.a().a(16.0).d();
   private static final bty i = bty.a().a(16.0).d().e();
   private final int j;
   private long k;

   public btr(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public btr() {
      this(20);
   }

   public final void b(akt $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }
   }

   protected abstract void a(akt var1, E var2);

   public abstract Set<bsn<?>> a();

   public static boolean b(bjm $$0, bjm $$1) {
      return $$0.dN().b(bsn.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bjm $$0, bjm $$1) {
      return $$0.dN().b(bsn.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bjm $$0, bjm $$1) {
      return $$0.dN().b(bsn.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
