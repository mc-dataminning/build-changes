import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cst {
   private final int a;
   public final bri c;
   public int d;
   public final int e;
   public final int f;

   public cst(bri $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cvp $$0, cvp $$1) {
      int $$2 = $$1.J() - $$0.J();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cvp $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cvp $$0) {
   }

   public void a(cnu $$0, cvp $$1) {
      this.c();
   }

   public boolean a(cvp $$0) {
      return true;
   }

   public cvp g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cvp $$0) {
      this.a($$0, this.g());
   }

   public void a(cvp $$0, cvp $$1) {
      this.f($$0);
   }

   public void f(cvp $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.ak_();
   }

   public int a_(cvp $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public Pair<alc, alc> b() {
      return null;
   }

   public cvp a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cnu $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cvp> a(int $$0, int $$1, cnu $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().J()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cvp $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cvp.k, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cvp b(int $$0, int $$1, cnu $$2) {
      Optional<cvp> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cvp.k);
   }

   public cvp d(cvp $$0) {
      return this.b($$0, $$0.J());
   }

   public cvp b(cvp $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cvp $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.J()), this.a_($$0) - $$2.J());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cvp.c($$2, $$0)) {
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

   public boolean b(cnu $$0) {
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
