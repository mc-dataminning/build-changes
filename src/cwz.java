import java.util.Optional;
import javax.annotation.Nullable;

public class cwz {
   private final int a;
   public final btz c;
   public int d;
   public final int e;
   public final int f;

   public cwz(btz $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.a = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void b(czk $$0, czk $$1) {
      int $$2 = $$1.M() - $$0.M();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(czk $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void c_(czk $$0) {
   }

   public void a(crj $$0, czk $$1) {
      this.d();
   }

   public boolean a(czk $$0) {
      return true;
   }

   public czk g() {
      return this.c.a(this.a);
   }

   public boolean h() {
      return !this.g().f();
   }

   public void e(czk $$0) {
      this.a($$0, this.g());
   }

   public void a(czk $$0, czk $$1) {
      this.f($$0);
   }

   public void f(czk $$0) {
      this.c.a(this.a, $$0);
      this.d();
   }

   public void d() {
      this.c.e();
   }

   public int a() {
      return this.c.ak_();
   }

   public int b_(czk $$0) {
      return Math.min(this.a(), $$0.k());
   }

   @Nullable
   public alg c() {
      return null;
   }

   public czk a(int $$0) {
      return this.c.a(this.a, $$0);
   }

   public boolean a(crj $$0) {
      return true;
   }

   public boolean b() {
      return true;
   }

   public Optional<czk> a(int $$0, int $$1, crj $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().M()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         czk $$3 = this.a($$0);
         if ($$3.f()) {
            return Optional.empty();
         } else {
            if (this.g().f()) {
               this.a(czk.k, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public czk b(int $$0, int $$1, crj $$2) {
      Optional<czk> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(czk.k);
   }

   public czk d(czk $$0) {
      return this.b($$0, $$0.M());
   }

   public czk b(czk $$0, int $$1) {
      if (!$$0.f() && this.a($$0)) {
         czk $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.M()), this.b_($$0) - $$2.M());
         if ($$3 <= 0) {
            return $$0;
         } else {
            if ($$2.f()) {
               this.e($$0.a($$3));
            } else if (czk.c($$2, $$0)) {
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

   public boolean b(crj $$0) {
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
