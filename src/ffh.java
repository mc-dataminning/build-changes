import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ffh implements ffc {
   protected static final ffc a = new ffh(false, false, -Double.MAX_VALUE, czk.k, $$0 -> false, null) {
      @Override
      public boolean a(ffr $$0, iv $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final czk e;
   private final Predicate<ewv> f;
   @Nullable
   private final bwi g;

   protected ffh(boolean $$0, boolean $$1, double $$2, czk $$3, Predicate<ewv> $$4, @Nullable bwi $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected ffh(bwi $$0, boolean $$1, boolean $$2) {
      this(
         $$0.cf(),
         $$2,
         $$0.dB(),
         $$0 instanceof bxj $$3 ? $$3.fa() : czk.k,
         $$1 ? $$0x -> true : ($$0 instanceof bxj $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(czg $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(ewv $$0, ewv $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public ffr a(eao $$0, dir $$1, iv $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ffr $$0, iv $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jb.a.b) - 1.0E-5F;
   }

   @Nullable
   public bwi d() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.d;
   }
}
