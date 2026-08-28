import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctw {
   private final int a;
   public final bsd c;
   public int d;
   public final int e;
   public final int f;

   public ctw(bsd $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(cwm $$0, cwm $$1) {
      int $$2 = $$1.L() - $$0.L();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(cwm $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cwm $$0) {
   }

   public void a(cou $$0, cwm $$1) {
      this.c();
   }

   public boolean a(cwm $$0) {
      return true;
   }

   public cwm g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(cwm $$0) {
      this.a($$0, this.g());
   }

   public void a(cwm $$0, cwm $$1) {
      this.f($$0);
   }

   public void f(cwm $$0) {
      this.c.a(this.a, $$0);
      this.c();
   }

   public void c() {
      this.c.e();
   }

   public int a() {
      return this.c.an_();
   }

   public int a_(cwm $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public Pair<alj, alj> b() {
      return null;
   }

   public cwm a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(cou $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<cwm> a(int $$0, int $$1, cou $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().L()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cwm $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(cwm.k, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public cwm b(int $$0, int $$1, cou $$2) {
      Optional<cwm> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(cwm.k);
   }

   public cwm d(cwm $$0) {
      return this.b($$0, $$0.L());
   }

   public cwm b(cwm $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         cwm $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.L()), this.a_($$0) - $$2.L());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (cwm.c($$2, $$0)) {
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

   public boolean b(cou $$0) {
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
