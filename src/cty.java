import java.util.Optional;
import javax.annotation.Nullable;

public class cty {
   private final int a;
   public final bsc c;
   public int d;
   public final int e;
   public final int f;

   public cty(bsc $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cwo $$0, cwo $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cwo $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cwo $$0) {
   }

   public void a(cow $$0, cwo $$1) {
      this.c();
   }

   public boolean a(cwo $$0) {
      return true;
   }

   public cwo g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cwo $$0) {
      this.a($$0, this.g());
   }

   public void a(cwo $$0, cwo $$1) {
      this.f($$0);
   }

   public void f(cwo $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.an_();
   }

   public int a_(cwo $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public akv b() {
      return null;
   }

   public cwo a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cow $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cwo> a(int $$0, int $$1, cow $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cwo $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cwo.j, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cwo b(int $$0, int $$1, cow $$2) {
      Optional<cwo> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cwo.j);
   }

   public cwo d(cwo $$0) {
      return this.b($$0, $$0.M());
   }

   public cwo b(cwo $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cwo $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.a_($$0) - $$2.M());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cwo.c($$2, $$0)) {
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

   public boolean b(cow $$0) {
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
