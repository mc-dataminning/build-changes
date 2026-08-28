import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fga implements ffv {
   protected static final ffv a = new fga(false, false, -Double.MAX_VALUE, czy.k, $$0 -> false, null) {
      @Override
      public boolean a(fgk $$0, iv $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final czy e;
   private final Predicate<exo> f;
   @Nullable
   private final bwt g;

   protected fga(boolean $$0, boolean $$1, double $$2, czy $$3, Predicate<exo> $$4, @Nullable bwt $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected fga(bwt $$0, boolean $$1, boolean $$2) {
      this(
         $$0.cg(),
         $$2,
         $$0.dC(),
         $$0 instanceof bxu $$3 ? $$3.fb() : czy.k,
         $$1 ? $$0x -> true : ($$0 instanceof bxu $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(czu $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(exo $$0, exo $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fgk a(ebe $$0, djf $$1, iv $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fgk $$0, iv $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jb.a.b) - 1.0E-5F;
   }

   @Nullable
   public bwt d() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.d;
   }
}
