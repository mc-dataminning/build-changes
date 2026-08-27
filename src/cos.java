import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class cos {
   private final int a;
   public final bny d;
   public int e;
   public final int f;
   public final int g;

   public cos(bny $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void b(crs $$0, crs $$1) {
      int $$2 = $$1.G() - $$0.G();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(crs $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(crs $$0) {
   }

   public void a(cka $$0, crs $$1) {
      this.b();
   }

   public boolean a(crs $$0) {
      return true;
   }

   public crs g() {
      return this.d.a(this.a);
   }

   public boolean h() {
      return !this.g().d();
   }

   public void e(crs $$0) {
      this.a($$0, this.g());
   }

   public void a(crs $$0, crs $$1) {
      this.f($$0);
   }

   public void f(crs $$0) {
      this.d.a(this.a, $$0);
      this.b();
   }

   public void b() {
      this.d.e();
   }

   public int a() {
      return this.d.ah_();
   }

   public int a_(crs $$0) {
      return Math.min(this.a(), $$0.i());
   }

   @Nullable
   public Pair<ajv, ajv> c() {
      return null;
   }

   public crs a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(cka $$0) {
      return true;
   }

   public boolean d() {
      return true;
   }

   public Optional<crs> a(int $$0, int $$1, cka $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.g().G()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         crs $$3 = this.a($$0);
         if ($$3.d()) {
            return Optional.empty();
         } else {
            if (this.g().d()) {
               this.a(crs.i, $$3);
            }

            return Optional.of($$3);
         }
      }
   }

   public crs b(int $$0, int $$1, cka $$2) {
      Optional<crs> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return $$3.orElse(crs.i);
   }

   public crs d(crs $$0) {
      return this.b($$0, $$0.G());
   }

   public crs b(crs $$0, int $$1) {
      if (!$$0.d() && this.a($$0)) {
         crs $$2 = this.g();
         int $$3 = Math.min(Math.min($$1, $$0.G()), this.a_($$0) - $$2.G());
         if ($$2.d()) {
            this.e($$0.a($$3));
         } else if (crs.c($$2, $$0)) {
            $$0.g($$3);
            $$2.f($$3);
            this.e($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(cka $$0) {
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
