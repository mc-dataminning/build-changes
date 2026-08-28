import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fgc implements ffx {
   protected static final ffx a = new fgc(false, false, -Double.MAX_VALUE, daa.k, $$0 -> false, null) {
      @Override
      public boolean a(fgm $$0, iw $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final daa e;
   private final Predicate<exq> f;
   @Nullable
   private final bwv g;

   protected fgc(boolean $$0, boolean $$1, double $$2, daa $$3, Predicate<exq> $$4, @Nullable bwv $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected fgc(bwv $$0, boolean $$1, boolean $$2) {
      this(
         $$0.cg(),
         $$2,
         $$0.dC(),
         $$0 instanceof bxw $$3 ? $$3.fb() : daa.k,
         $$1 ? $$0x -> true : ($$0 instanceof bxw $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(czw $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(exq $$0, exq $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fgm a(ebg $$0, djh $$1, iw $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fgm $$0, iw $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jc.a.b) - 1.0E-5F;
   }

   @Nullable
   public bwv d() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.d;
   }
}
