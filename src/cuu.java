import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuu {
   private final int a;
   public final bsx c;
   public int d;
   public final int e;
   public final int f;

   public cuu(bsx $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cxk $$0, cxk $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cxk $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cxk $$0) {
   }

   public void a(cps $$0, cxk $$1) {
      this.c();
   }

   public boolean a(cxk $$0) {
      return true;
   }

   public cxk g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cxk $$0) {
      this.a($$0, this.g());
   }

   public void a(cxk $$0, cxk $$1) {
      this.f($$0);
   }

   public void f(cxk $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.ao_();
   }

   public int a_(cxk $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public Pair<alz, alz> b() {
      return null;
   }

   public cxk a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cps $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cxk> a(int $$0, int $$1, cps $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cxk $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cxk.k, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cxk b(int $$0, int $$1, cps $$2) {
      Optional<cxk> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cxk.k);
   }

   public cxk d(cxk $$0) {
      return this.b($$0, $$0.L());
   }

   public cxk b(cxk $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cxk $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cxk.c($$2, $$0)) {
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

   public boolean b(cps $$0) {
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
