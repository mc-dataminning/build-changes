import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fgm implements fgh {
   protected static final fgh a = new fgm(false, false, -Double.MAX_VALUE, dak.l, $$0 -> false, null) {
      @Override
      public boolean a(fgw $$0, iw $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final dak e;
   private final Predicate<eya> f;
   @Nullable
   private final bxe g;

   protected fgm(boolean $$0, boolean $$1, double $$2, dak $$3, Predicate<eya> $$4, @Nullable bxe $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected fgm(bxe $$0, boolean $$1, boolean $$2) {
      this(
         $$0.cg(),
         $$2,
         $$0.dC(),
         $$0 instanceof byf $$3 ? $$3.fb() : dak.l,
         $$1 ? $$0x -> true : ($$0 instanceof byf $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(dag $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(eya $$0, eya $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fgw a(ebq $$0, djr $$1, iw $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fgw $$0, iw $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jc.a.b) - 1.0E-5F;
   }

   @Nullable
   public bxe d() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.d;
   }
}
