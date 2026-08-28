import java.util.Optional;
import javax.annotation.Nullable;

public class ctz {
   private final int a;
   public final bsc c;
   public int d;
   public final int e;
   public final int f;

   public ctz(bsc $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cwp $$0, cwp $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cwp $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cwp $$0) {
   }

   public void a(cox $$0, cwp $$1) {
      this.c();
   }

   public boolean a(cwp $$0) {
      return true;
   }

   public cwp g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cwp $$0) {
      this.a($$0, this.g());
   }

   public void a(cwp $$0, cwp $$1) {
      this.f($$0);
   }

   public void f(cwp $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.an_();
   }

   public int a_(cwp $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public aku b() {
      return null;
   }

   public cwp a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cox $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cwp> a(int $$0, int $$1, cox $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cwp $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cwp.j, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cwp b(int $$0, int $$1, cox $$2) {
      Optional<cwp> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cwp.j);
   }

   public cwp d(cwp $$0) {
      return this.b($$0, $$0.M());
   }

   public cwp b(cwp $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cwp $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cwp.c($$2, $$0)) {
               $$0.h($$3);
               $$2.g($$3);
               this.e($$2);
            }

            return $$0;
         }
      } else {
         return $$0;
      }
   }

   public boolean b(cox $$0) {
      return this.a($$0) && this.a(this.g());
   }

   public int i() {
      return this.a;
   }

   public boolean e() {
      return true;
   }

   public boolean f() {
      return false;
   }
}
