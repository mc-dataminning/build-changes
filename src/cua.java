import java.util.Optional;
import javax.annotation.Nullable;

public class cua {
   private final int a;
   public final bse c;
   public int d;
   public final int e;
   public final int f;

   public cua(bse $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cwq $$0, cwq $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cwq $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cwq $$0) {
   }

   public void a(coy $$0, cwq $$1) {
      this.c();
   }

   public boolean a(cwq $$0) {
      return true;
   }

   public cwq g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cwq $$0) {
      this.a($$0, this.g());
   }

   public void a(cwq $$0, cwq $$1) {
      this.f($$0);
   }

   public void f(cwq $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.an_();
   }

   public int a_(cwq $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public akv b() {
      return null;
   }

   public cwq a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(coy $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cwq> a(int $$0, int $$1, coy $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cwq $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cwq.j, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cwq b(int $$0, int $$1, coy $$2) {
      Optional<cwq> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cwq.j);
   }

   public cwq d(cwq $$0) {
      return this.b($$0, $$0.M());
   }

   public cwq b(cwq $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cwq $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cwq.c($$2, $$0)) {
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

   public boolean b(coy $$0) {
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
