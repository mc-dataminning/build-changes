import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ffm implements ffh {
   protected static final ffh a = new ffm(false, false, -Double.MAX_VALUE, czn.k, $$0 -> false, null) {
      @Override
      public boolean a(ffw $$0, iv $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final czn e;
   private final Predicate<exa> f;
   @Nullable
   private final bwi g;

   protected ffm(boolean $$0, boolean $$1, double $$2, czn $$3, Predicate<exa> $$4, @Nullable bwi $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected ffm(bwi $$0, boolean $$1, boolean $$2) {
      this(
         $$0.cf(),
         $$2,
         $$0.dB(),
         $$0 instanceof bxj $$3 ? $$3.fa() : czn.k,
         $$1 ? $$0x -> true : ($$0 instanceof bxj $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(czj $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(exa $$0, exa $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public ffw a(eat $$0, diu $$1, iv $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ffw $$0, iv $$1, boolean $$2) {
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
